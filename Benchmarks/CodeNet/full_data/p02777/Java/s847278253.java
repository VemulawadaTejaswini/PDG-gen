import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.next();
        if(u==s){
            a =-1;
        }
        else {
            b-=1;
        }
        System.out.print(a);
        System.out.print(b);
    }
}