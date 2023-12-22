import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int cnt = Integer.parseInt(scan.next());
        //int total = Integer.parseInt(scan.next());

        long input = scan.nextLong();
        long total = 0;
        for(int i=1; i<input; i++) {
            if((i%3 ==0) && (i%5 ==0)) {

            } else if(i%3 ==0) {

            } else if (i%5 ==0) {

            } else {
                total += i;
            }
        }
        System.out.println(total);
    }
}
