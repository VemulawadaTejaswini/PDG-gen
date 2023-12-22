import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer P = Integer.parseInt(scan.next());
        Integer Q = Integer.parseInt(scan.next());
        Integer R = Integer.parseInt(scan.next());

        System.out.println(P+Q < P+R ? (P+Q < Q+R ? P+Q : Q+R) : (P+R < Q+R ? P+R : Q+R) );
    }
}