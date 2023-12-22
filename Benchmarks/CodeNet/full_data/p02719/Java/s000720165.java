import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long tmp = n;
        while(true){
            long hoge = Math.abs(tmp - k);
            if(hoge <= tmp){
                tmp = hoge;
            }else{
                break;
            }
        }
        System.out.println(tmp);
    }
}
