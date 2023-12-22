import java.util.*;
public class Main {
    public static int[] accumulate (int[] array) {
  	//累積和
    for (int i=1; i<array.length; i++) {
    	array[i] += array[i-1];
    }
        return array;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt(), Q = sc.nextInt();
	    String S = sc.next();
	    int[] numArray = new int [N];
	    for (int i=0; i<N-1; i++) {
	        numArray[i+1] = (S.substring(i,i+2).equals("AC"))? 1: 0;
	    }
	    int[] sumArray = accumulate(numArray);
	    for (int q=0; q<Q; q++) {
	        int l = sc.nextInt()-1, r = sc.nextInt()-1;
	        int ans = sumArray[r] - sumArray[l];
	        System.out.println(ans);
	    }
	}
}