package medicine;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
		Medicine1 arr[]=new Medicine1[5];
		arr[0]= new Tablet();
		arr[1]= new Syrup();
		arr[2]= new Ointement();
		int rand_arr = rand.nextInt(3); 
		Medicine1 m=arr[rand_arr] ;
		m.displayLabel();
		m.getDetails();
	}

}
