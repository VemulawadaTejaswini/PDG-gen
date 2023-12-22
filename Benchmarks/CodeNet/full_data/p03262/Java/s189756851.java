import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int city[] = new int[n];
    for(int i = 0; i < n; i++){
      city[i] = sc.nextInt();
      city[i] = Math.abs(city[i] - x);
    }
    
    int max = city[0];
    for(int i = 0; i < n; i++)
    	max = max > city[i] ? gcd(max, city[i]) : gcd(city[i], max);
    System.out.println(max);
    
  }
  
  static int gcd(int a, int b){
	if (b == 0) return(a);
	return(gcd(b, a % b));
  }
}