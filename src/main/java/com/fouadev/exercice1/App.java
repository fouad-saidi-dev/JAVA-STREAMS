package com.fouadev.exercice1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> mots = new ArrayList<>();

        mots.add("php");
        mots.add("angular");
        mots.add("java");
        mots.add("react");

        // 1 - filter
        System.out.println("-----------Q1-----------");
        mots.stream()
                .filter((l) -> l.contains("a"))
                .forEach(System.out::println);

        // 2 - filter
        System.out.println("------Q2--------");
        mots.stream()
                .filter((m) -> m.trim().length() > 3 )
                        .map((c) -> new StringBuilder(c).reverse())
                                .forEach(System.out::println);


        // 3 - filter chaine contient "e" et aplatir chaque chaine en liste de caracteres
        System.out.println("------Q3--------");
        mots.stream()
                .filter(m -> m.contains("e"))
                .flatMap(m -> m.chars().mapToObj(c -> (char)c))
                .toList()
                .forEach(System.out::println);


        // 4 - transformer en version majuscule
        System.out.println("------Q4--------");
        mots.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 5 - Convertir chaque chaine en sa longuer
        System.out.println("----------Q5----------");
        mots.stream()
                .map(String::length)
                .forEach(System.out::println);

        // 6 -
        System.out.println("-----Q6-------");
        mots.stream()
                .flatMap(m -> m.chars().mapToObj(c -> (char)c))
                .toList()
                .forEach(System.out::println);

        // 7 -
        System.out.println("----------Q7----------");
        mots.stream()
                .map(c  -> c+"-"+mots.indexOf(c))
                .forEach(System.out::println);

    }
}
