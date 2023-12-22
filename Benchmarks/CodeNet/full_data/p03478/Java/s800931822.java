import java.util.*;

public class Main{
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int sum = 0;
      
    for(int i=0; i<N; i++){
    int n = i;
    int digsum = 0;
    while(n>0){
    //各桁の和を求めていこう
    digsum = digsum + n%10;
    n /= 10;
    }
    if(digsum >= A && digsum <= B)
      sum = sum+i;
    }
    
    System.out.println(sum);
    }
}
  
  
