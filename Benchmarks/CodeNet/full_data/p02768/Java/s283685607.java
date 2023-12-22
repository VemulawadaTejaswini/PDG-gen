import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    long sum = 0;
    long before = 1;
    
    for(long i=n; i>0; i--){
      if(i != a && i != b){
      long score = before * i / (n - i + 1);
      sum += score;
      before = score;  
      }
    } 
    System.out.println(sum % (Math.pow(10,9) + 7));
  }
}
