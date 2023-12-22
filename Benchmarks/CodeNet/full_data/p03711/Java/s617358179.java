import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int[] array1 = {1,3,5,7,8,10,12};
      int[] array2 = {4,6,9,11};
      if((array1.contains(x)&&array1.contains(y))||(array2.contains(x)&&array2.contains(y)))
        System.out.println("Yes");
      else System.out.println("No");
    }
}