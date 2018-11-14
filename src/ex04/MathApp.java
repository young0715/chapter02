package ex04;

public class MathApp {

	public static void main(String[] args) {
		
		/*Math.java에 static 쓰기 전 */
		Math math = new Math();
		int sum = math.plus(3, 5);
		System.out.println(sum);
		
		double area = math.circleArea(5);
		System.out.println(area);
		/*//Math.java에 static 쓰기 전 */
		
		/*Math.java에 static을 쓰고 난 후 */
		int static_int_sum = Math.plus(66, 33);
		System.out.println(static_int_sum);
		
		double static_double_sum = Math.plus(12.3, 33.4);
		System.out.println(static_double_sum);
		/*//Math.java에 static을 쓰고 난 후 */
	}
}
