import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
				int B = sc.nextInt();

				if(A <= B){
					System.out.println(0);
				}else if(A <= 2*B){
					System.out.println(0);
				}else{
					System.out.println(A - B);
				}
    }
}