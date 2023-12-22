import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
        double K = scanner.nextDouble();
      
		for(int i=0; i<=K-1; i++){
          
        	if(A >= 1){
           		A=A-1;
         	}else if(B >= 1){
           		B=B-1;
         	}
        }
       
        System.out.println(A);
        System.out.println(B);
    }
}
