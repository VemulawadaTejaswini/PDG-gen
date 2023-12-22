import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       //nが青のボールの個数以下
       if(n<=a){
           System.out.println(n);
          }else if(a<n&&n<=a+b){
              System.out.println(a);
            }else{
                //何個のブロック分かを出す
                int block = n/(a+b);
                int amari = n/(a+b);
                int total = a*block;
                if(amari<=a){
                    total+=amari;
                }else if(a<amari){
                    total+=a;
                }
                System.out.println(total);
            }
    }
}