package helloWorld;
import java.util.HashMap;

public class dataHashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> listOfName = new HashMap<String, Integer>();	
		HashMap<String, Integer> listOfName2 = new HashMap<String, Integer>();
		HashMap<String, Integer> listOfName3 = new HashMap<String, Integer>();
		HashMap<String, Integer> listOfName4 = new HashMap<String, Integer>();
		HashMap<String, Integer> listOfName5 = new HashMap<String, Integer>();
		HashMap<String, Integer> listOfName6 = new HashMap<String, Integer>();
		HashMap<String, Integer> listOfName7 = new HashMap<String, Integer>();
		listOfName.put("johnDoe", 1);	//put data in hashmap
		listOfName.put("tony", 11);
		listOfName2.put("johnDoe", 2);
		listOfName2.put("tony", 12);
		listOfName3.put("johnDoe", 3);
		listOfName3.put("tony", 13);
		listOfName4.put("johnDoe", 4);
		listOfName4.put("tony", 14);
		listOfName5.put("johnDoe", 5);
		listOfName5.put("tony", 15);
		listOfName6.put("johnDoe", 6);
		listOfName6.put("tony", 16);
		listOfName7.put("johnDoe", 7);
		listOfName7.put("tony", 17);
		System.out.println("Day 1");
		for (String i : listOfName.keySet()) {	//output data hashmap
		      System.out.println(i + "  " + listOfName.get(i));
		}
		System.out.println("Day 2");
		for (String i : listOfName2.keySet()) {
		      System.out.println(i + "  " + listOfName2.get(i));
		}
		System.out.println("Day 3");
		for (String i : listOfName3.keySet()) {
		      System.out.println(i + "  " + listOfName3.get(i));
		}
		System.out.println("Day 4");
		for (String i : listOfName4.keySet()) {
		      System.out.println(i + "  " + listOfName4.get(i));
		}
		System.out.println("Day 5");
		for (String i : listOfName5.keySet()) {
		      System.out.println(i + "  " + listOfName5.get(i));
		}
		System.out.println("Day 6");
		for (String i : listOfName6.keySet()) {
		      System.out.println(i + "  " + listOfName6.get(i));
		}
		System.out.println("Day 7");
		for (String i : listOfName7.keySet()) {
		      System.out.println(i + "  " + listOfName7.get(i));
		}
	}
}

