import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=sc.nextInt();
        sc.close();
        int a=Math.abs(l),b=l,c=l,gt=l;
        for(int i=1;i<n;i++){
            gt+=(l+i);
            a=Math.min(a,Math.abs(c+i));
            if(a==Math.abs(c+i))b=c+i;
        }
        System.out.println(gt-b +"\n");
    }
}