import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        for (int x = 0 ; x<= s.length();x++){
            a+="x";
            System.out.println(a);
        }
    }
}