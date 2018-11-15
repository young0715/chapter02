package ex05;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
//		1.doubleToInt();
		double[] d1 = {1.1, 2.2, 3.3};
		int[] d2 = ArrayUtil.doubleToInt(d1);
		for(int i=0; i<d2.length; i++) {
			System.out.println(d2[i]);
		}
		
//		2.intToDouble();
		int[] i1 = {1, 2, 3};
		double[] i2 = ArrayUtil.intToDouble(i1);
		for(int i=0; i<i2.length; i++) {
			System.out.println(i2[i]);
		}
		
		
//		3. concat();
		int[] a1 = {10, 20, 30};
		int[] a2 = {100, 200, 300};
		int[] a3 = ArrayUtil.concat(a1, a2);
		
		for(int i=0; i<a3.length; i++) {
			System.out.println(a3[i]);
		}
	}

}
