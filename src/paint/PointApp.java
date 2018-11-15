package paint;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		/* scanner 이용한 생성자 활용
		Scanner scanner = new Scanner(System.in);
		System.out.print("x : ");
		int x = scanner.nextInt();
		
		System.out.print("y : ");
		int y = scanner.nextInt();
		
		new Point(x,y);
		System.out.println("점[x=" + x + ",y=" + y + "]을 그렸습니다.");
		
		scanner.close();
		*/
		
		Point p1 = new Point(2,5);
		p1.showInfo();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.showInfo();
		
		Point p3 = new Point(12);
		p3.setY(55);
		p3.showInfo();
		
		p3.showInfo(true);
		p3.showInfo(false);
		
	}

}
