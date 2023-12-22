import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		 String S = sc.next();
      	 int N=S.length();
         String x = S.substring(0,N/2);
      	 String y = S.substring(N/2+1,N);
        if(x.equals(y)){
        System.out.println("Yes");}
      	else{
        System.out.println("No");}
	}
}