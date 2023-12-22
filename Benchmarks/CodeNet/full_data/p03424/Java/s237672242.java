import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String a="Three";
        for(int i=0;i<N;i++) {
            String s=sc.next();
            if(s.equals("Y")) {
                a="Four";
            }
        }
        System.out.println(a);

    }

}
