import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
      	long nam = 0;
      
      for(int i =1;i <= n ;i++){
        if(n>=i*i){nam=i*i;}
        else{break;}
      }
      System.out.print(nam);
	}
}