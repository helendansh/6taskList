package com.company;

import java.util.*;
import java.time.Instant;
import java.time.Duration;

/**
 * Зачтено 03.06.2021
 */

public class Main {

    public static void main(String[] args) {
    List<Integer> arlist = new ArrayList<>();
    List<Integer> linklist = new LinkedList<>();
    System.out.println("Прошло времени в ArrayList, мс: " + countTime(addlist(arlist)));
    System.out.println("Прошло времени в LinkedList, мс: " + countTime(addlist(linklist)));
    }
    public static List<Integer> addlist (List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        return list;
    }
    public static void getlist (List<Integer> list) {
       for (int i=0; i < 100000; i++) {
            list.get(i);
        }
    }
    public static long countTime (List<Integer> list) {
        Instant start = Instant.now();
        getlist(list);
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }
}
