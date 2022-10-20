package math;

public class Rectangular {
	int side1;
	int side2;
	
	public Rectangular(int side1, int side2) {
		this.side1=side1;
		this.side2=side2;
	}
	
	public int getPerimeter() {
		return 2*(side1 + side2);
	}
	public int getArea() {
		return side1*side2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
