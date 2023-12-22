import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();
        
        char[] list = S.toCharArray();
        for(int i = 0; i < list.length; i += w){
          System.out.print(list[i]);
        }
         System.out.println();
      
    }
}