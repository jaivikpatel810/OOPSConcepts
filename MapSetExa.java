// Java program using Map and Set concepts

import java.util.*;

public class MapSetExa {

	public static void main(String args[]) {
		// Creating LinkedHashSet implementation using the Set 
		Set<String> set = new LinkedHashSet<String> ();
		set.add("Hello");
		set.add("World");
		set.add("Have a nice day");

		System.out.println(set);

		// Creating Linked Hash Map  
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(01, "Jaivik");
		map.put(02, "Patel");
		map.put(03, "Ahmedabad");

		System.out.println(map);
	}

}
