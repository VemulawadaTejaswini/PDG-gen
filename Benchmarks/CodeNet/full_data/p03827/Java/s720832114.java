import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String str = sc.next();
      int[] list =new int[n];
      int count=0;
      for(int i=0;i<n;i++){
        if(str.charAt(i)=='D'){
          list[i]= count--;
        }else{
          list[i]= count++;
        }
      }
      Arrays.sort(list);
      System.out.println(list[n-1]);
	}
}