package Inheritance;

class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void toArea() {
		int Area = length * breadth;
		System.out.println("The area of the rectangle is " + Area);
	}

	void toPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
}
class Square extends Rectangle {
	// Intializing the side of square using constructor
	int s;
	public Square(int s) {
		super(s,s);
		this.s=s;
	}
	void printArea() {
		int area = s * s;
		System.out.println("The area of the square is" + area);
	}

	void printperimeter() {

		int perimeter = 4 * s;
		System.out.println("The area of the square is" + perimeter);
	}
}

public class Question4 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(7, 8);
		rect.toArea();
		rect.toPerimeter();

		Square sqr = new Square(5);
		sqr.printArea();
		sqr.printperimeter();

	}

}
