package test;

import java.util.Scanner;

abstract class Shape{
	protected float area;
	public abstract void calculateArea( );
	public final float getArea() {
		return this.area;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
class Triangle extends Shape{
	private float base;
	private float height;
	public void setBase(float base) {
		this.base = base;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void calculateArea( ) {
		this.area = (float) (0.5 * this.base * this.height);
	}
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Shape shape) {
		if( shape instanceof Rectangle ) {
			Rectangle rect = (Rectangle) shape;
			System.out.print("Length	:	");
			rect.setLength(sc.nextFloat());
			System.out.print("Breadth	:	");
			rect.setBreadth(sc.nextFloat());
		}else if( shape instanceof Circle ) {
			Circle c = (Circle) shape;
			System.out.print("Radius	:	");
			c.setRadius(sc.nextFloat());
		}else {
			Triangle t = (Triangle) shape;
			System.out.print("Base	:	");
			t.setBase(sc.nextFloat());
			System.out.print("Height	:	");
			t.setHeight(sc.nextFloat());
		}
	}
	private static void printRecord(Shape shape) {
		System.out.println("Area	:	"+shape.getArea());
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("3.Triangle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Shape shape = null;
			switch( choice ) {
			case 1:
				shape = new Rectangle(); //Upcasting
				break;
			case 2:
				shape = new Circle();	//Upcasting
				break;
			case 3:
				shape = new Triangle();	//Upcasting
				break;
			}
			if(  shape != null ) {
				Program.acceptRecord( shape );
				shape.calculateArea( );
				Program.printRecord( shape );
			}
		}
	}
}
