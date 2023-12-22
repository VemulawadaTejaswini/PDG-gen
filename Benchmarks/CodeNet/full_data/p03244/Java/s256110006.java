import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b[]=new int [a];
        for(int i=0;i<a;i++){
            b[i]=x.nextInt();
        }
        int qq=0;
        for(int i=0;i<a-1;i++){
            if(b[i]==b[i+1])
                qq=b[i];
        }
        if(qq==b[0]){
            System.out.println(a/2);
        }
        else{
            int count=0;
            for(int i=2;i<a-2;i++){
                if(b[i]!=b[i+2]&&b[i]!=b[i-2]){
                    count++;
                     b[i+2]=b[i];
                }
            }
            System.out.println(count);
        }
     }
}