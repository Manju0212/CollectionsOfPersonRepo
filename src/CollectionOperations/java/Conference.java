package CollectionOperations.java;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Conference {
    private Set<Person> attendees = new HashSet<>();

    public void addAttendee(Person person) {
        attendees.add(person);
    }

    public void removeAttendee(Person person) {
        attendees.remove(person);
    }

    public Set<Person> findDuplicateAttendees() {
        Set<Integer> ids = new HashSet<>();
        return attendees.stream()
                .filter(person -> !ids.add(person.getId()))
                .collect(Collectors.toSet());
    }

    public Set<Person> listAllUniqueAttendees() {
        return new HashSet<>(attendees);
    }

    public Set<Person> findAttendeesByAgeRange(int minAge, int maxAge) {
        return attendees.stream()
                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge)
                .collect(Collectors.toSet());
    }
}
