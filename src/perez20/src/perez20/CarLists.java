package perez20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CarLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> myCars = new ArrayList<>();
		
		//Adding cars to the ArrayList
		myCars.add(new Car("Chevy", "Sonic", 11999.99));
		myCars.add(new Car("Chevy", "Corvette", 75999.99));
		myCars.add(new Car("Chevy", "Silverado", 29999.99));
		myCars.add(new Car("Toyota", "Tundra", 36999.99));
		myCars.add(new Car("Acura", "TL", 42999.99));
		myCars.add(new Car("BMW", "3 Series", 45999.99));
		
		//Sorting cars by price using Collections & Car comparator	
		Collections.sort(myCars, new CarComparator());
		
		//Display entire collections of cars (after sort)
		System.out.println("Cars sorted by price...");
		Iterator<Car> iterator = myCars.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().carToString());
		}
		
		//Get the highest priced car
		System.out.println("\n\nMost Expensive " + Collections.max(myCars, new CarComparator()).carToString() + "\n\n");
			
		//Creating a LinkedList from an Arary List
		LinkedList<Car> linkedList = new LinkedList<>(myCars);
		//Adding car to linked list at index 4
		linkedList.add(4, new Car("Ford", "Mustang", 19999.99));
		//Sorting the linked list
		Collections.sort(linkedList, new CarComparator());
		
		//Creating a ListIterator and displaying cars (will display by price 
		//if code placed after the Collections.sort method
		ListIterator<Car> listCars = linkedList.listIterator();
		while(listCars.hasNext())
		{
			System.out.println(listCars.next().carToString());
		}
		
		//Remove the first and last cars from the linkedList
		System.out.println("\n\n");
		System.out.println(linkedList.removeLast().carToString());
		System.out.println(linkedList.removeFirst().carToString());	
		
		//Reverse the order of the cars, can use ListIterator with hasPrevious()
		Collections.reverseOrder(new CarComparator());

	}

}
/*
Class CarLists (main class)  code it in this order
•	Create an ArrayList of at least six cars, not ordered in any way by price.
•	Create an Iterator and use it to display the entire list of cars.
•	Display the most expensive car in the list. Use the Collections class.
•	Create a linked list from the arraylist.
•	Insert another Car at index 4 in the linked list. This car should now be the cheapest in the list.
•	Sort the linked list in order of increasing price.
•	Create and use a ListIterator to display the linked list in order of increasing price.
•	Remove the first and last Cars from the linked list, displaying them as you do so.
•	Use the ListIterator again to iterate back through the list so cars are now shown in order of decreasing price.
*/
