package CollectionOperations.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Task 1
        PersonManager personManager = new PersonManager();
        Person p1 = new Person(1, "AAA", 30);
        Person p2 = new Person(2, "BBB", 25);
        personManager.addPersonToHashSet(p1);
        personManager.addPersonToHashSet(p2);
        personManager.addPersonToLinkedHashSet(p1);
        personManager.addPersonToLinkedHashSet(p2);
        
        System.out.println("HashSet: " + personManager.getHashSet());
        System.out.println("LinkedHashSet: " + personManager.getLinkedHashSet());

        // Task 2
        SetOperations.main(args);

        // Task 3
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(new Person(3, "CCC", 35));

        Person maxAgePerson = ComplexOperations.findMaxAge(set);
        Person minAgePerson = ComplexOperations.findMinAge(set);
        List<Person> sortedByAge = ComplexOperations.sortByAge(set);
        Set<Person> filteredByAge = ComplexOperations.filterByAge(set, 28);

        System.out.println("Max Age Person: " + maxAgePerson);
        System.out.println("Min Age Person: " + minAgePerson);
        System.out.println("Sorted by Age: " + sortedByAge);
        System.out.println("Filtered by Age > 28: " + filteredByAge);

        // Task 4
        PerformanceAnalysis.main(args);

        // Task 5
        Conference conference = new Conference();
        conference.addAttendee(p1);
        conference.addAttendee(p2);
        conference.addAttendee(new Person(3, "CCC", 35));
        conference.addAttendee(new Person(2, "AAA", 25)); // Duplicate

        Set<Person> duplicateAttendees = conference.findDuplicateAttendees();
        Set<Person> uniqueAttendees = conference.listAllUniqueAttendees();
        Set<Person> ageRangeAttendees = conference.findAttendeesByAgeRange(25, 35);

        System.out.println("Duplicate Attendees: " + duplicateAttendees);
        System.out.println("Unique Attendees: " + uniqueAttendees);
        System.out.println("Attendees with Age 25-35: " + ageRangeAttendees);
    }
}
