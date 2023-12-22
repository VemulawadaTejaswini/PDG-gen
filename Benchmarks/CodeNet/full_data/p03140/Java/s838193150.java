import java.util.*;
public class MAin{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] a = sc.next().toCharArray();
      char[] b = sc.next().toCharArray();
      char[] c = sc.next().toCharArray();
      int cnt = n;
      for(int i = 0;i < n;i++)if(a[i]==b[i]&&b[i]==c[i])cnt--;
      System.out.println(cnt);
    }
}