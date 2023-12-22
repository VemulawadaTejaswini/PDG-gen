import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= num; i++) {
        	total += i;
        }
        System.out.println(total);
    }

    static String[] strCompare(String[] array) {
    	Arrays.sort(array, new Comparator<String>() {
    		public int compare(String s1, String s2) {
    			if(compareLength(s1, s2) == 0) {
    				return s1.compareTo(s2);
    			}
    			return compareLength(s1, s2);
    		}
    	});
    	return array;
    }

    static int compareLength(String s1, String s2) {
    	if(s1.length() > s2.length()) {
    		return 1;
    	} else if (s1.length() < s2.length()) {
    		return -1;
    	} else {
    		return 0;
    	}
    }
    
    static String[] strCompareReverse(String[] array) {
    	Arrays.sort(array, new Comparator<String>() {
    		public int compare(String s2, String s1) {
    			if(compareLengthReverse(s1, s2) == 0) {
    				return s1.compareTo(s2);
    			}
    			return compareLengthReverse(s1, s2);
    		}
    	});
    	return array;
    }

    static int compareLengthReverse(String s1, String s2) {
    	if(s1.length() > s2.length()) {
    		return 1;
    	} else if (s1.length() < s2.length()) {
    		return -1;
    	} else {
    		return 0;
    	}
    }

    static int[] toIntArray(String[] str) {
    	int[] num = new int[str.length];
    	for(int i = 0; i < str.length; i++) {
    		num[i] = Integer.parseInt(str[i]);
    	}
    	return num;
    }

    static char[] strToCharArray(String str) {
    	char[] chAr = new char[str.length()];
    	chAr = str.toCharArray();
    	return chAr;
    }


    static String[] toStringArray(String str, String delim) {
    	String[] stAr = str.split(delim);
    	return stAr;
    }

    static int[] strToIntArray(String str, String delim) {
    	String[] strAr = str.split(delim);
    	int[] intAr = new int[strAr.length];
    	for(int i = 0; i < strAr.length; i++) {
    		intAr[i] = Integer.parseInt(strAr[i]);
    	}
    	return intAr;
    }

    static int toInt(String str) {
    	int num = Integer.parseInt(str);
    	return num;
    }

    static double[] strToDoubleArray(String str, String delim) {
    	String[] strAr = str.split(delim);
    	double[] dAr = new double[str.length()];
    	for(int i = 0; i < strAr.length; i++) {
    		dAr[i] = Double.parseDouble(strAr[i]);
    	}
    	return dAr;

    }
}