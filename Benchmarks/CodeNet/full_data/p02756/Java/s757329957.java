import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static String fun(String a) {
        return new StringBuilder(a).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String a=sc.next();
        int t=sc.nextInt();
        String[]qian=new String[600001];
        String[]hou=new String[600001];
        int flag=0;
        int c=300000;
        int d=c;
        while(t-->0){
            int v=sc.nextInt();
            if(v==1)
                flag++;
            else{
                int p=sc.nextInt();
                String q=sc.next();
                //正向
                if(flag%2==0){
                    if(p==2)
                        hou[c++]=q;
                    else
                        qian[d--]=q;
                }else{
                    if(p==2)
                        qian[d--]=q;
                    else
                        hou[c++]=q;
                }

            }

        }
        String f="";
        String g="";
        for(int i=0;i<qian.length;i++) {
            if (qian[i] !=null)
                f+=qian[i];
        }

        for(int i=0;i<hou.length;i++) {
            if (hou[i] !=null)
               g+=hou[i];
        }
        if(flag%2==1) {
            f = Main.fun(f);
            a = Main.fun(a);
            g = Main.fun(g);
            System.out.println(g+a+f);
        }else
            System.out.println(f+a+g);


    }
}



