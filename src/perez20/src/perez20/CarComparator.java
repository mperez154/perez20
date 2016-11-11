package perez20;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	public int compare(Car arg0, Car arg1) {
		// TODO Auto-generated method stub
		double car1 = arg0.price;
		double car2 = arg1.price;
		
		if(car1 > car2)
		{
			return 1;
		}
		else if(car1 < car2)
		{
			return 2;
		}
		else
			return 0;
	}

}


/*Class CarComparator
•	Code it to compare Car objects by price from lowest to highest*/