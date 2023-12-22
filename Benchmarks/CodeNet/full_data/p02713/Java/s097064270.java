import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int n = (int) scanner.nextInt();
        int ans = 0;
      	for (int i = 1; i <= n; i++){
        for (int j = 1; j <= n; j++){
        for (int k = 1; k <= n; k++){
          int c = gcd(i, j);		
          ans+= gcd(k, c);
        }
        }
        }
      System.out.println(ans);
      
    }
  	
  	static int gcd(int a, int b){
    	while(a != b){
        	if (a >= b){
            	a-=b;
            }else{
            	b-=a;
            }
        }
      return a;
    }
}