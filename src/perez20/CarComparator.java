package perez20;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	public int compare(Car arg0, Car arg1) {

		if (arg0.getPrice() > arg1.getPrice()) {
			return 1;
		} else if (arg0.getPrice() < arg1.getPrice()) {
			return -1;
		} else
			return 0;
	}
}