import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age == 1){
            System.out.println("Hello World");
        }else{
            int a = sc.nextInt(),b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}