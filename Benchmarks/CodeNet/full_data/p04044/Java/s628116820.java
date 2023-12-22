import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int L = sc.nextInt();
      	String[] strs = new String [N+1];
      	for (int i =0; i<N+1 ; i++){
          	String string = sc.nextLine();
        	strs[i] = string;
        }
        Arrays.sort(strs);
        String str = "";
        for (int i =0; i<N+1 ; i++){
        	str += strs[i];
        }
        System.out.println(str);
   		sc.close();
	}
}