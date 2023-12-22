import java.util.*;
public class Main {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int M=sc.nextInt();
         int [] p=new int[N];
         int pen=0;
           int cor=0;
             for(int v=0;v<M;v++){
                int i =sc.nextInt()-1;
                String S=sc.next();
                if(S.equals("WA")&& p[i]<=0 ){
                    pen++;
                }else if(S.equals("AC")&& p[i]<=0){
                    p[i]=1;
                    cor++;
                }
             }
             
             
             System.out.println(cor);
              System.out.println(pen);
         
     }
}