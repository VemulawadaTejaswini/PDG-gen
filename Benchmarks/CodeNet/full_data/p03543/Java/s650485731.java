import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] array = new int[4];
      int i = 0;
      while(n >= 1){
      	array[i] = n%10;
        i++;
        n = n/10;
      }
      if( (array[0]==array[1]&&array[1]==array[2])||(array[1]==array[2]&&array[2]==array[3]) ){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}
