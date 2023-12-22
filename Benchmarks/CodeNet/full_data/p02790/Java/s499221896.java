import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
      
      	String astr = "";
      	String bstr = "";
      
      	for (int i=0 ; i<a ; i++) {
          astr = astr + Integer.toString(a);
        }
      
        for (int i=0 ; i<b ; i++) {
          bstr = bstr + Integer.toString(b);
        }
      
      	String[] temp = {astr,bstr};
        Arrays.sort(temp);
 
        System.out.println(temp[0]);
   
	}
}
