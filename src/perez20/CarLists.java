package perez20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CarLists {

	public static void main(String[] args) {
		ArrayList<Car> myCars = new ArrayList<>();

		// Adding cars to the ArrayList
		myCars.add(new Car("Chevy", "Corvette", 60000.66));
		myCars.add(new Car("Acura", "TL", 40000.44));
		myCars.add(new Car("Chevy", "Silverado", 20000.22));
		myCars.add(new Car("Chevy", "Sonic", 10000.11));
		myCars.add(new Car("Toyota", "Tundra", 30000.33));
		myCars.add(new Car("BMW", "3 Series", 50000.55));

		// Display entire collections of cars (after sort)
		System.out.println("Iterator displaying cars:\n");
		Iterator<Car> iterator = myCars.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().carToString());
		}

		// Get the highest priced car using the collection class
		System.out.println("\nMost Expensive " + Collections.max(myCars, new CarComparator()).carToString() + "\n");

		// Creating a LinkedList from an ArrayList
		LinkedList<Car> linkedList = new LinkedList<>(myCars);

		// Adding the cheapest car to linked list at index 4
		linkedList.add(4, new Car("Ford", "Mustang", 4999.59));

		// Sorting the linked list
		Collections.sort(linkedList, new CarComparator());

		// Creating a ListIterator and displaying cars
		ListIterator<Car> listCars = linkedList.listIterator();
		System.out.println("LinkedList results:\n");
		while (listCars.hasNext()) {
			System.out.println(listCars.next().carToString());
		}

		// Remove the first and last cars from the linkedList
		System.out.println("\nRemoving " + linkedList.removeFirst().carToString());
		System.out.println("Removing " + linkedList.removeLast().carToString());

		// using listIterator to display cars
		ListIterator<Car> listCars2 = linkedList.listIterator();
		System.out.println("\nDisplaying in reverse order with most expense and cheapest removed:\n");
		while (listCars2.hasNext()) {
			listCars2.next();
		}
		while (listCars2.hasPrevious()) {
			System.out.println(listCars2.previous().carToString());
		}
	}
}
