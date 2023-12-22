import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        ArrayList<Long> ff = new ArrayList<Long>();
        for (long i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                ff.add(i);
                i = 1;
            }
        }
        Collections.sort(ff);
        long a = 1;
        long b = 1;
        for (int i=0;i<ff.size();i++){
            if (i%2==0){
                a *= ff.get(i);
            }else {
                b *= ff.get(i);
            }
        }
        System.out.println(a+b-2);

    }

}