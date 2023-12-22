import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        sc.next();
        String po=sc.next();
      String po2=po.replace("ABC","");
      System.out.println((po.length()-po2.length())/3);
    }
}
