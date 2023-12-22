import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String c1 =  s1.substring(0,1);
        String c2 =  s2.substring(1,2);
        String c3 =  s3.substring(2,3);


        System.out.println(c1+c2+c3);

    }
}