import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
      int B = scn.nextInt();
      int m = scn.nextInt();
		int[] a = new int[A];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      int[] b = new int[B];
		for(int i=0; i<b.length; ++i){
			b[i] = scn.nextInt();
		}
      int[] c = new int[m*3];
		for(int i=0; i<c.length; ++i){
			c[i] = scn.nextInt();
		}
	}
}
//一旦保存
