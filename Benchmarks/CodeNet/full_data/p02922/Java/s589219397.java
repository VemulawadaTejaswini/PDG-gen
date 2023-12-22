import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
      	int C = B%A;
      
      	if(C == 0){
        int D = B/A;
        System.out.println(D);
        }else{
        int D = B/A + 1;
        System.out.println(D);
        }
        
      
    }
}