import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                int n = s.nextInt();
          //    int d = s.nextInt();
                int i=0,j=0,k=0,ans=0,ss=0,r=0;
                for(i=1;i<=n;i++){
                    if(i%2!=0){
                       r = i;
                       for(j=1;j<=n;j++){
                           if(r%j==0){
                              ss++;
                           }
                       }
                       if(ss==8){
                          ans++;
                       }
                       ss = 0;
                    }
                }
                System.out.println(ans);
	}
}