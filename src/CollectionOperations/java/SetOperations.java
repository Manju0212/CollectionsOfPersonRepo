package CollectionOperations.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Person> set1 = new HashSet<>();
        Set<Person> set2 = new LinkedHashSet<>();

        // Adding elements to the sets
        set1.add(new Person(1, "AAA", 30));
        set1.add(new Person(2, "BBB", 25));
        set1.add(new Person(3, "CCCC", 35));
        set1.add(new Person(3, "DDD", 35)); // Duplicate

        set2.add(new Person(3, "EEE", 35));
        set2.add(new Person(4, "FFF", 40));
        set2.add(new Person(5, "GGG", 45));
        set2.add(new Person(5, "DDD", 45)); // Duplicate

        // Union
        Set<Person> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        Set<Person> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (set1 - set2)
        Set<Person> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference1);

        // Difference (set2 - set1)
        Set<Person> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference (set2 - set1): " + difference2);
    }
}

