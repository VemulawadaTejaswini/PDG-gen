import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();        
        int b = sc.nextInt();

        if(n == 1){
            System.out.println("Hello World");
        } else if(n == 2) {
            System.out.println(a + b);
        }        
    }
}