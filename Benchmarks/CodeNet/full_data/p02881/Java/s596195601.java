import java.util.Scanner;

class Main{
	public static void main(String[] args){
      	long x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	for (long i = 1; i*i <= n; i++) { 
          if (n%i == 0) {
             x = i;     
             if (i != n / i) {
                  y = (n/i);
              }
          }
        }

        
        System.out.println(x+y-2);
          
	}
}