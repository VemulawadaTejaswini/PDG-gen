import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        String s = sc.next();
        String[] sArray = s.split("");
        int i = 0;
      	for(i = 0; i < a;i++){
 		try {
        	Integer.parseInt(sArray[i]);
        	} catch (NumberFormatException e) {
          	System.out.println("No");
          	System.exit(0);
   			}
        }
      	if(!sArray[a].equals("-")){
            System.out.println("No");
            System.exit(0);
          }
      	for(i = a + 1; i < a + b + 1;i++){
 		try { 
        	Integer.parseInt(sArray[i]);
        	} catch (NumberFormatException e) {
          	System.out.println("No");
      	    System.exit(0);
   			}
        }
      	System.out.println("Yes");

	}
}