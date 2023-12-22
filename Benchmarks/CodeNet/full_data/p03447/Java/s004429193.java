import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int X=sc.nextInt();
        X=X-A;
        while(X>B){
            X=X-B;
            if(X<B){System.out.println(X);}
          
        }
        

        


    }
}
