package perez20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> myCars = new ArrayList<>();
		Car car1 = new Car("Chevy", "Sonic", 11999.99);
		Car car2 = new Car("Chevy", "Corvette", 75999.99);
		Car car3 = new Car("Chevy", "Silverado", 29999.99);
		
		myCars.add(car1);
		myCars.add(car2);
		myCars.add(car3);
		
		Iterator<Car> iterator = myCars.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().carToString());
		}
		
		//See test comparator for help with finding the most expensive car (pages 774-777)
		//Collections.max(myCars, CarComparator)); (page 776 has example)
		//Use the collections class to sort by price, display most expensive

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
