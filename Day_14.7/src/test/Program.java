package test;
public class Program {
	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[ 0 ] );
			System.out.println("Number	:	"+number);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
