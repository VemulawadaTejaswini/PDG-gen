import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int po=Math.min(r-l+1,2019);
        long ans=100000000;
        for(int i=0;i<po-1;i++){
            for(int j=i+1;j<po;j++){
                long ans2=1;
                ans2=((long)(l+i))*(l+j);
                ans2%=2019;
                ans=Math.min(ans,ans2);
            }
        }
        System.out.println(ans);
    }
}
