import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=10*a+b;
        for(int i=0;i<c;i++){
            if(i*i==c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        


    }
}