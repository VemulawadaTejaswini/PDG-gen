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
      for(int i = 0;i < array.length;i++){
      	if(array[i] != i+1) count1++;
      }
      
      if(count1 == 0 || count1 == 2 ) System.out.print("YES");
      else System.out.println("NO");
    }
}
