import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int res = 0, current = 10;
      while(sc.hasNext()){
        int a = sc.nextInt();
        if(a%10 == 0){res-=10;}
        else if(a%10 < current){current = a%10;}
        
        res += (a/10+1)*10;
      }
      System.out.println(res - 10 + current);
    }
}