package CollectionOperations.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerformanceAnalysis {
    public static void main(String[] args) {
        int size = 100000;
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashSet.add(new Person(i, "Person " + i, i % 100));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("HashSet add time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(new Person(i, "Person " + i, i % 100));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) + " ms");

        // Removing elements
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashSet.remove(new Person(i, "Person " + i, i % 100));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HashSet remove time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedHashSet.remove(new Person(i, "Person " + i, i % 100));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) + " ms");

        // Contains operation
        for (int i = 0; i < size; i++) {
            hashSet.add(new Person(i, "Person " + i, i % 100));
            linkedHashSet.add(new Person(i, "Person " + i, i % 100));
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashSet.contains(new Person(i, "Person " + i, i % 100));
        }
        endTime = System.currentTimeMillis();
        System.out.println("HashSet contains time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedHashSet.contains(new Person(i, "Person " + i, i % 100));
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet contains time: " + (endTime - startTime) + " ms");
    }
}

