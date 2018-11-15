package ex05;

public class ArrayUtil {
	public static int[] doubleToInt(double[] source) {
		int len1 = source.length;
		int[] result = new int[len1];
		for(int i=0; i<len1; i++) {
			result[i] = (int)source[i];
		}
		return result;
	}
	
	public static double[] intToDouble(int[] source) {
		int len1 = source.length;
		double[] result = new double[len1];
		for(int i=0; i<len1; i++) {
			result[i] = source[i];
		}
		return result;
	}
	
	public static int[] concat(int[] s1, int[] s2) {
		int len1 = s1.length;
		int len2 = s2.length;
		int[] result = new int[len1 + len2];
		
		int idx=0;
		for(int i=0; i<len1; i++, idx++) {
			result[idx] = s1[i];
		}
		for(int i=0; i<len2; i++, idx++) {
			result[idx] = s2[i];
		}

		
		return result;
	}
}
