import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int X = sc.nextInt();
        if(X<=A){
            System.out.println(10);
        }else if(X>=A){
            System.out.println(0);
        }
    }
}