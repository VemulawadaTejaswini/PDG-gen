import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 int A[] = new int [5];
    	 int total=0;
    	 int B=0;
    	 int ans=0;
    	 for(int i =0;i<5;i++){
    		A[i]=sc.nextInt();
    		total += A[i];
    		B = A[i]%10;
    		if(B != 0){
    		ans += 10%B;
    		}
    	 }

    	 System.out.println(ans+total);

    }

}