import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      int x = 0;
		int[] a = new int[n+1];
		for(int i=1; i<=a.length; ++i){
          a[0]=0;
			a[i] = a[i-1]+i;
		}
      System.out.println(a[i]);
	}
}