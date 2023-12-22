import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        ary[0]=sc.nextInt();
        boolean flag=false;
        for(int i=1;i<n;i++){
            Arrays.sort(ary,0,i);
            int b=sc.nextInt();
            int from=0,to=i-1;
            while(from<=to){
                int now=ary[(from+to)/2];
                if(now==b){
                    flag=true;
                    break;
                }else if(now>b){
                    to=(from+to)/2-1;
                }else{
                    from=(from+to)/2+1;
                }
            }
            if(flag==false){
                ary[i]=b;
            }
        }
        if(flag){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}