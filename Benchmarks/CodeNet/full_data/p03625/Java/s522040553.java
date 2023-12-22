import java.util.*;
public class Main{
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int s = 1;
      int count = 0;
      int a[] = new int[n];
      
      for(int i = 0; i < n; i++) a[i] = sc.nextInt();
      Arrays.sort(a);
      
      for(int i = n-1; i > 0 && count < 2; i--){
      	if (a[i] == a[i-1] && s != a[i]){
          s = s * a[i];
          count++;
        }
      }
      
      if (count < 2) System.out.println(0);
      else System.out.println(s);
      
    }
}