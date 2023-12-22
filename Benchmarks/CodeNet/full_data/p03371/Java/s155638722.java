import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
     	int AB = sc.nextInt();
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	
        Long sum = (long) 0;
      	if(AB>=((A+B)/2)){
          	sum = (long) (A*X+B*Y);
      		System.out.println(sum);
          	return;
        }
      
      	int min = X;
      	int max = Y;
      	
      	if(Y<X){
        	min = Y;
          	max = X;
        }
      
      	sum = (long) (A*(max-min)+2*(AB*Y));
      	System.out.println(sum);
        return;
	}
}
