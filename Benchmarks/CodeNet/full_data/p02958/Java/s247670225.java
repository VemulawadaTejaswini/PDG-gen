import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[n];
      for(int i = 0;i < array.length;i++){
      	array[i] = sc.nextInt();
      }
      
      int count1 = 0;
      int count2 = 0;
      for(int i = 0;i < array.length;i++){
      	if(array[i] == i) count1++;
        if(array[i] == n-i) count2++;
      }
      
      if(count1 == n || count1 == n-2 || count2 == n || count2 == n-2) System.out.print("YES");
      else System.out.println("NO");
    }
}
