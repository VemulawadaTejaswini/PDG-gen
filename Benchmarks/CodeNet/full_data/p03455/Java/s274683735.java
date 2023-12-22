import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int so = (a * b)%2;
        if(so == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}