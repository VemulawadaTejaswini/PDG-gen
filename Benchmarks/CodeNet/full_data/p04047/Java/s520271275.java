package myjava1;
import java.util.*;
public class MyJava1 {
    public static void main(String[] args) {
        int x=0,s=0,m=1,p=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        p=n*2;
        int []a=new int[p];
         for(int i=0;i<p;i++){
              a[i]=in.nextInt();
          } 
        for(int i=0;i<(p-1);i++){
            for(int j=1+i;j<p;j++){
                if(a[i]<a[j]){
                 int t =a[i];
                 a[i]=a[j];
                 a[j]=t;                 
                }              
            }         
        }        
        for(int i=0;i<(p-1);i++){
            for(int j=m;j<p;j++){
            if(a[i]>a[j]||a[i]==a[j]){
              x=a[j];
             s=s+x;
             m=m+2;
             break;
            }         
        }          
    }
    System.out.println(s);
    }
}