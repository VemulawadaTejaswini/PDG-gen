import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       IntKyuuryouHantei(sc.nextInt());
    }
    private static void IntKyuuryouHantei(int A){
        int ans = (1+A)*5000;
        System.out.println(ans);
    }
}
