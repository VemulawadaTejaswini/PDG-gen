import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)){
            System.out.println("Yes");
        }
        if(Math.sqrt(a)+Math.sqrt(b)>Math.sqrt(c)){
            System.out.println("No");
        }
        else{
            System.out.println("No");
        }
    }
}