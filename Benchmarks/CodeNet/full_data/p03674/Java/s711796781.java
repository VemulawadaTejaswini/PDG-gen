

import java.util.*;

/**
 * Created by DELL on 2017/7/1.
 */

public class Main {
    static long fac(int x,int num){
        long a=1;
        for (int i = 0; i <num ; i++) {
            a*=x-i;
            a/=(i+1);
            if(a>1e9+7)
                a-=1e9+7;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int dup=0;
        List<Integer>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        for (int i = 0; i <n+1 ; i++) {
            int x=in.nextInt();
            list.add(x);
            if(list.contains(x))dup=list.indexOf(x);
        }
        for (int i = 1; i <n+2; i++) {
            System.out.println(fac(n+1,i)-fac(n-dup,i-2)<0?fac(n+1,i)-fac(n-dup,i-2)+1e9+7:fac(n+1,i)-fac(n-dup,i-2));
        }
    }
}
