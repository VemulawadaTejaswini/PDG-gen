import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int len = sc.nextInt();
      int[] syutugen = new int[100005];
      Arrays.fill(syutugen,0);
      for(int i = 0; i < len; i++){
        int tmp = sc.nextInt() + 1;
        syutugen[tmp]++;
        syutugen[tmp - 1]++;
        syutugen[tmp + 1]++;
      }
      Arrays.sort(syutugen);
      System.out.println(syutugen[syutugen.length - 1]);
	}
}
