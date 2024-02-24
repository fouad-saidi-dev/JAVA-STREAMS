package com.fouadev.exercice2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Employe> employes = new ArrayList<>();

        employes.add(new Employe("ahmed","IT",9000));
        employes.add(new Employe("mehdi","Back Office",6000));
        employes.add(new Employe("rita","RH",7000));
        employes.add(new Employe("brahim","PR",8000));


        System.out.println("--------Q1----------");
        double sum = employes.stream()
                .mapToDouble(Employe::getSalaire)
                .sum();

        System.out.println(sum);

        System.out.println("--------Q2----------");
        employes.stream()
                .map(Employe::getNom)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------Q3----------");

        Optional<Employe> minSalary = employes.stream()
                .min((s1, s2) -> Double.compare(s1.getSalaire(), s2.getSalaire()));

        System.out.println(minSalary.get());

        System.out.println("--------Q4----------");

        employes.stream()
                .filter(employe -> employe.getSalaire() > 7000)
                .forEach(System.out::println);

        System.out.println("--------Q5----------");

        Optional<Double> maxSalary = employes.stream()
                .map(Employe::getSalaire)
                .reduce(Double::max);

        System.out.println(maxSalary);

        System.out.println("--------Q6----------");
        String concatNames = employes.stream()
                .map(Employe::getNom)
                .reduce("",(nom1,nom2) -> nom1+", "+nom2)
                ;

        System.out.println(concatNames);



    }
}
