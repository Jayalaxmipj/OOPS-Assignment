package interfaceShape;

public class Rectangle implements Polygon1 {
	
		public float lenght;
		public float breadth;
		public Rectangle(float lenght, float breadth) {
			super();
			this.lenght = lenght;
			this.breadth = breadth;
			
		}
		public void calcArea() {
			float area=lenght*breadth;
			System.out.println("Area of the Rectangle"+area);
		}
		public void calcPeri() {
			float peri=2*(lenght+breadth);
			System.out.println("perimeter of rectangle="+peri);
			
		}
		
	}
