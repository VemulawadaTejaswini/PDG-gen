import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	if(a > b){
        	if(a>c && c>b) System.out.println("Yes");
          	else System.out.println("No");
        }else{
        	if(a<c && c<b) System.out.println("Yes");
          	else System.out.println("No");
        }
    }
}