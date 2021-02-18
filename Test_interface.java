package interface_test;

import interfaceShape.Rectangle;
import interfaceShape.Square;

public class Test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(5);
		Rectangle rect=new Rectangle(12,8);
		sq.calcArea();
		sq.calcPeri();
		rect.calcArea();
		rect.calcPeri();
	}

}
