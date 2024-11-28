package test;
class Shape{
	protected float area;
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
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(10);
		t.calculateArea();
		System.out.println("Area	:	"+t.getArea());
	}
	public static void main2(String[] args) {
		Circle c = new Circle();
		c.setRadius(10);
		c.calculateArea();
		System.out.println("Area	:	"+c.getArea());
	}
	public static void main1(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setLength(10);
		rect.setBreadth(20);
		rect.calculateArea();
		System.out.println("Area	:	"+rect.getArea());
	}
}
