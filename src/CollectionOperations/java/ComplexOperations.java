package CollectionOperations.java;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComplexOperations {
	
    public static Person findMaxAge(Set<Person> set) {
    	
        return set.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
    }

    public static Person findMinAge(Set<Person> set) {
        return set.stream().min(Comparator.comparingInt(Person::getAge)).orElse(null);
    }

    public static List<Person> sortByAge(Set<Person> set) {
        List<Person> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt(Person::getAge));
        return list;
    }

    public static Set<Person> filterByAge(Set<Person> set, int age) {
    	
        Set<Person> result = new HashSet<>();
        for (Person person : set) {
        	
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }
}
