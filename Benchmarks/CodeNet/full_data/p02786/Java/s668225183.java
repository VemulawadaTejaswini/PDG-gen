import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long H = sc.nextLong();
      long count =0;
      while(true){
        H/=2;
        count++;
        if(H==1){
          break;
        }
      }
      long ans =1+2*((long)Math.pow(2,count)-1);
      System.out.println(ans);
    }
}