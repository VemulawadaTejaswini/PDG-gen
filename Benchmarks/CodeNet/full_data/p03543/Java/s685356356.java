import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        
        int num1000, num100, num10, num1;
        String cnt;
        
        num1 = N % 10;
        num10 = (N % 100 - num1) / 10;
        num100 = (N % 1000 - num10 - num1) / 100;
        num1000 = (N - num100 - num10 - num1) / 1000;
        
        if(num1000 == num100 && num100 == num10)cnt ="Yes";
        else if(num100 == num10 && num10 == num1)cnt ="Yes";
        else cnt = "No";
            
        System.out.println(cnt);
	  