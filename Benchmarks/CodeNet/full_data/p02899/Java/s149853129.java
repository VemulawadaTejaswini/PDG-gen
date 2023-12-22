import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n+1];
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i = 1;i <= n;i++){
        a[i]=sc.nextInt();
        map.put(a[i],i);
      }
      Arrays.sort(a);
      for(int i = 1;i <= n;i++){
      	System.out.print(map.get(a[i]));
        if(i!=n)System.out.print(" ");
      }
      System.out.println("");
    }
}
