import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        int l = Integer.parseInt(ins[0]);
        int r = Integer.parseInt(ins[1]);
        int diff = l % 2019;
        int rdiff = 2019 - diff;
        if(r > l + rdiff) {
            System.out.println(1);
        }else if(r == l + rdiff){
            System.out.println(0);
        }else{
            System.out.println((l * (l + 1)) % 2019);
        }
    }
}