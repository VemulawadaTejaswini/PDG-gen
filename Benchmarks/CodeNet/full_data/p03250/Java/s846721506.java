import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		        int Big = Math.max(A, Math.max(B,C));
		        if (A==Big){
		            System.out.println(10*Big+B+C);
		        }else if (B==Big){
		            System.out.println(10*Big+A+C);
		        }else{
		            System.out.println(10*Big+A+B);
		        }
		     
	}

}