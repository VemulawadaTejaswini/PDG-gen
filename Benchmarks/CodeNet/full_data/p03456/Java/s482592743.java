import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
      	String s = a + b;
        int i = Integer.parseInt(s);
      
      	for(int j=0; j<=1000; j++){
          if(j*j==i){
            System.out.println("YES");
            return;
          }
        }
         System.out.println("NO");
	}
}
