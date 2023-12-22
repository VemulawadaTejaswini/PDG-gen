import java.util.*;

public class Main{
	public static void main(String[] args) {
      int []cnt=new int[5];
      boolean ans=true;
      Scanner in =new Scanner(System.in);
      for (int i=0;i<6;i++){
        int a=in.nextInt();
      	if (++cnt[a]==3)ans=false;
     
      }
     if (!ans)System.out.println("NO");
        else System.out.println("YES");
      
      return;
    }
}
