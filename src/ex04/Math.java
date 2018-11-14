package ex04;

public class Math {
	private static double PI = 3.14;
	
	public static int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static double plus(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	public static double circleArea(int r) {
		double area = PI * r * r;
		return area;
	}
}
