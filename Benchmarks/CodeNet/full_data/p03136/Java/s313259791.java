import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    int sum = 0;
    int max = 0;
    int b = 0;
    for(int i=0;i<a;i++){
      b=sc.nextInt();
      sum+=b;
      if(max<=b){
        max=b;
      }
    }
    sum-=max;
    if(max<sum)System.out.println("Yes");
	else System.out.println("No");
  }
}