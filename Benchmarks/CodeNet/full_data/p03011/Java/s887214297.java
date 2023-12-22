import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int P,Q,R;
      	int max;
      	P = sc.nextInt();
      	Q = sc.nextInt();
      	R = sc.nextInt();
      
      	if(P >= Q){
        	if(P >= R){
            	max = Q + R;
            }else{
            	max = P + R;
            }
        }else if(Q >= R){
        		max = P + R;
        }else{
						max = P + Q;
				}
      
      	System.out.println(max);
    }
}
