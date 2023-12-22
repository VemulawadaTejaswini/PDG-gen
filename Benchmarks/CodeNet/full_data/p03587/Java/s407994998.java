import java.util.Scanner;
class Main{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int S=sc.nextInt();
          int  s=0;
          for(int i=5;i>0;i--){
               int a=1;
               for(int n=i;n>0;n--){
                     a=a*10;
             }s+=S/a;
              if(S/a==1){
                     S=S-a;
             }
        }System.out.print(s);
   }
}