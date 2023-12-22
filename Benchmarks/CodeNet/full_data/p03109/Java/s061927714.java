import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( s.compareTo("2019/04/30")<=0?"Heisei":"TBD" );
    }
}
