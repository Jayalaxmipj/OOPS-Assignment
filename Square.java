package interfaceShape;

public class Square implements Polygon1{
	 
		public float side;

		public Square(float side) {
			super();
			this.side = side;
		}
		public void calcArea() {
			float area=side*side;
			System.out.println("Area of the square"+area);
		}
		public void calcPeri() {
			float peri=4*side;
			System.out.println("perimeter of square="+peri);
			
		}
	}
