import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int ans=0;
        while(111<=a&&a<=999){
            int b=a/100;
            int c=a%100/10;
            int d=a%100%10/1;
            ans=(10-b)*100+(10-c)*10+(10-d);
            break;
        }
        System.out.println(ans);
     }
}