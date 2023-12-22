import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int ab;
        int cd;
        if(a<b) {
            ab=a;
        } else {
            ab=b;
        }
        if(c<d) {
            cd=c;
        } else {
            cd=d;
        }
        System.out.println(ab+cd);
    }
}