import java.util.*;

public class Main{
  
  static int price(int cost){
    	float a = cost/1.08;
    	int b = (int) a;
    	if((b*1.08)==(float) cost){
          return b;
        }
    	else if(((b+1)*1.08) == (float) cost){
          return b+1;
        }
    	else return -1;
  }
  public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int a = price(n);	
    if(a!=-1){
          	System.out.println(a);
        }else System.out.println(":(");
  }
}