import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        int[] t=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            t[i]=sc.nextInt();
        }
        String sleep=sc.next();
        boolean flag=false;
        int ans=0;
        for(int i=0;i<n;i++){
            if(flag)ans+=t[i];
            if(sleep.equals(s[i]))flag=true;
        }
        System.out.println(ans);
 
    }


}