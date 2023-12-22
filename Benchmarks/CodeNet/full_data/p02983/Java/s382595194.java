import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        if(r < 2019){
            System.out.println(((r % 2019) * ((r - 1) % 2019)) % 2019);
        }else if(l <= 2019 && r >= 2019){
            System.out.println(0);
        }else{
            System.out.println(((l % 2019) * ((l + 1) % 2019)) % 2019);
        }
    }
}