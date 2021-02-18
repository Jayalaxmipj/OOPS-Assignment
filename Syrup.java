package medicine;

import java.util.Date;

public class Syrup extends Medicine1 {
	public Syrup()
	{
		super();
		price=450;
		expiryDate=new Date();
	}

	public Syrup(double price, Date expiryDate) 
	{
		super(price, expiryDate);
	
	}

	@Override
	public void displayLabel() 
	{
		
		System.out.println("Syrup name(xyz)"+ "\n"+"Before use shake it well");

	}

}
