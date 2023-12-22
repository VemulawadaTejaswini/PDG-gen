import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 int A[] = new int [5];


    	 for(int i = 0; i<5;i++){
    		  A[i] = sc.nextInt();
    	 }
    	 int K = sc.nextInt();

    	 if(K >= (A[4]-A[0]) ){
    		 System.out.println("Yay!");

    	 }else{
    		 System.out.println(":(");
    	 }

    }

}