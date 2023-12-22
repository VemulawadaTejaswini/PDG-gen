import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
           if(i%2 == 0){
               if(a%2 == 1){
                    a = (a - 1)/2;
                    b = b + a;
               }else{
                    a = a/2;
                    b = b + a;
               }
           }else{
               if(b%2 == 1){
                   b = (b - 1)/2;
                   a = a + b;
                   
               }else{
                   b = b/2;
                   a = a + b;
               }
           }
        }
        System.out.print(a);
        System.out.print(b);
    }
}