import java.util.*;
public class Main {
  
  public static int gcd2(int i, int j){
    if(i == 0){
      return j;
    }
    else
    {
      return gcd2(j%i, i);
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n; i++){
      	for(int j = i+1; j <= n; j++){
          	int gcd2tmp = gcd2(i, j);
          	for(int k = j+1; k <= n; k++){
            	//3 items
      			sum += gcd2(gcd2tmp, k) * 6;
          	}
          	//2 items
          	sum += gcd2tmp * 6;
          	//System.out.println(gcd2tmp);
    	}
      //1 item
      sum += i;
    }
    
    System.out.println(sum);
  }
}