import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int result;
        if(D != 0) {
        	result = (int)Math.pow(100,D)*N; 
        	System.out.println(result);
        }else {
        	System.out.println(N);
        }
        
    }
}
