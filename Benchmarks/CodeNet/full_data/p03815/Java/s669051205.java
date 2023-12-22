import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
      System.out.println((n%11==0)?n/11*2:(n%11<=5)?n/11*2+1:n/11*2+2);
    }
}
