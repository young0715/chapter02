package paint;

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
//		p1.showInfo();
		drawPoint(p1);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
//		p2.showInfo();
		drawPoint(p2);
		
		Point p3 = new Point(12);
		p3.setY(55);
		p3.showInfo();
		
		p3.showInfo(true);
		p3.showInfo(false);
		
//		Rect rect = new Rect(10, 20, 100, 200);
//		drawRect(rect);
		
		Shape s1 = new Rect();
		drawShape(s1);
		
		Shape s2 = new Triangle();
		drawShape(s2);
		
		Shape s3 = new Circle();
		drawShape(s3);
		
		//Downcasting 인 경우는 명시적으로 캐스팅으로 해야한다.
		Circle c = (Circle)s3;
		c.setRadius(10);
		
		//Upcasting인 경우는 암시적으로 캐스팅 한다.
		Shape s4 = c;
		s4.setFillColor("red");
	}

	private static void drawPoint(Point point) {
		point.showInfo();
	}
	
	private static void drawRect(Rect rect) {
		rect.draw();
	}
	
	private static void drawTriangle(Triangle triangel) {
		triangel.draw();
	}
	
	private static void drawShape(Shape shape) {
		shape.draw();
	}
}
