package Dp;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        class tuple{
            double a;
            int b;
            double c;
            tuple(double a,int b,double c){
                this.a=a;
                this.b=b;
                this.c=c;
            }
        }
        int q=in.nextInt(),h=in.nextInt(),s=in.nextInt(),d=in.nextInt();
        int n=in.nextInt();
        tuple arr[]={new tuple(0.25,q,q/0.25),new tuple(0.5,h,h/0.5),new tuple(1.0,s,s/1.0),new tuple(2.0,d,d/2.0)};
        Arrays.sort(arr,new Comparator<tuple>(){
           public int compare(tuple o1,tuple o2){
               if(o1.c>o2.c){
                   return 1;
               }
               else if(o1.c<o2.c){
                   return -1;
               }
               return 0;
            }
        });
        long ans=0;
        for (int i = 0; i < 4; i++) {
            int x=(int)(n/arr[i].a);
            if(x==0){
                continue;
            }else {
                if(n%arr[i].a!=0) {
                    ans += (long)x* arr[i].b;
                    n= (int) (n-arr[i].a);
                }
                else {
                    ans+=(long)x*arr[i].b;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
