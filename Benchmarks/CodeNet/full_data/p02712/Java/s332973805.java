import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int[] a=new int[N];
      	long sum=0;
      
      	for(int i=0;i<N;i++){
        if(a[i]%3==0){
        	a[i]="Fizz";
        }
        else if(a[i]%5==0){
        	a[i]="Buzz";
        }
        else if(a[i]%3==0&&a[i]%5==0){
            a[i]="FizzBuzz";
        }
        else{
        a[i]=i;
        sum=sum+i;
        }
        
        }
      System.out.println(sum);
      
        
		
		
	}
}