import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<Integer>();
 

    String str = sn.nextLine();
      
String[] num = str.split(" ", 3);
      int[] ia = new int[num.length];
for (int i = 0; i < num.length; i++) {
    ia[i] = Integer.parseInt(num[i]); // throws NumberFormatException
}
		int A=ia[1]/ia[0];
		if(A>ia[2]){
		    A=ia[2];
		}
      System.out.println(A);

}
}