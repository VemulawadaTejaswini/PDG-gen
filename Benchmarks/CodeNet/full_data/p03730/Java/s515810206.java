import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

 		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int cc = a % b;
      	int ce = cc;
      	String str = "NO";
      	boolean con = true;
      	int i = 1;
      	
      	do{
          if(cc == c) {
            str = "YES";
            con = false;          
          }
          i++;
          cc = (a*i)%b;
          if(ce == cc) con = false;
        }while(con);
      
      	System.out.println(str);
        
	}
}
