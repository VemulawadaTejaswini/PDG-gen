import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    int A [] = new int [N];
        for(int i = 0; i < N; i++)
        	A [i] = scanner.nextInt();
        
        int test= 0;
        int c = gcd(A);
  
        for(int i = N-1; i > 0; i--){
        	test = A[i];
        	A[i]=A[i-1];
        	if (c<gcd(A))
        		c=gcd(A);
        	
            A[i]=test;
        	
        }
        System.out.println(c);
	}
	
	 public static int gcd(int[] numbers) {
		 int gcd=1;
	     int index=2;
	     if(numbers.length==1)
	    	 gcd=numbers[1];
	        
	     if(numbers.length>1)
	         gcd=euclidGcd(numbers[0],numbers[1]); 
	        
	     while(index<numbers.length){
	         gcd=euclidGcd(gcd,numbers[index]);
	         index++;
	     }
	     return gcd;
	}
	 
	    public static int euclidGcd(int num1,int num2){
	    	int temp=0;
	        while(num2!=0){
	            temp=num2;
	            num2=num1%num2;
	            num1=temp;
	        }
	        num1=num1<0 ? num1 * (-1):num1;
	        return num1;
	    }
}
	 