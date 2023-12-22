import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      Arrays.sort(a);
      long x = 1;
      List<Integer> list = new ArrayList<Integer>();
      for(int i = n-1;i > 0;i--){
      	if(a[i]==a[i-1]&&list.size()<=1){
          x *= (long)a[i];
          list.add(a[i]);
          i--;
        }
        if(list.size()==2)break;
      }
      if(list.size()<=1)System.out.println(0);
      else System.out.println(x);
    }
}