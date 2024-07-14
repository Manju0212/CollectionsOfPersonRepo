package CollectionOperations.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonManager {
    private Set<Person> hashSet = new HashSet<>();
    
    private Set<Person> linkedHashSet = new LinkedHashSet<>();

    public void addPersonToHashSet(Person person) {
    	
        hashSet.add(person);
    }

    public void addPersonToLinkedHashSet(Person person) {
    	
        linkedHashSet.add(person);
    }

    public Set<Person> getHashSet() {
    	
        return hashSet;
    }

    public Set<Person> getLinkedHashSet() {
    	
        return linkedHashSet;
    }
}

