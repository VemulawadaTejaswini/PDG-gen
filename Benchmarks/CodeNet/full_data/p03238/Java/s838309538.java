import java.util.Scanner;

class Main {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n==1?"Hello World":(sc.nextInt()+sc.nextInt()));
    }
}