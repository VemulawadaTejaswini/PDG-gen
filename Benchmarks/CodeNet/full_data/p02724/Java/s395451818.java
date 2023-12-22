import java.util.*;

public class Main{
	public static void main(String[] arg){
    	Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      long ans=0;
      ans+=1000*(long)((x)/500);
      ans+=5*(long)((x-500*(long)(x/500))/5);
      System.out.println(ans);
        
    }
}