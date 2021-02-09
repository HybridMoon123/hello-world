package helloWorld;
import java.util.HashMap;

public class dataHashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> listOfName = new HashMap<String, Integer>();	
		HashMap<String, Integer> listOfName2 = new HashMap<String, Integer>();
		listOfName.put("johnDoe", 1);	//put data in hashmap
		listOfName.put("tony", 11);
		listOfName2.put("johnDoe", 2);
		listOfName2.put("tony", 12);
		System.out.println("Day 1");
		for (String i : listOfName.keySet()) {	//output data hashmap
		      System.out.println(i + "  " + listOfName.get(i));
		}
		System.out.println("Day 2");
		for (String i : listOfName2.keySet()) {
		      System.out.println(i + "  " + listOfName2.get(i));
		}
	}
}

