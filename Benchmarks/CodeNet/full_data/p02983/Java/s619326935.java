import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());

        sc.close();

        if (R -L > 2019) {

        	System.out.println(0);
        	System.exit(0);
        }

        long mod2019;
        long min = 2*10^9;

        for (long i = L; i < R; i++) {

            for (long j = i+1; j <= R; j++) {

            	mod2019 = i*j%2019;

                if (min > mod2019) {

                    min = mod2019;
                }

                if (min == 0) {

                	break;
                }
            }

            if (min == 0) {

            	break;
            }
        }

        System.out.println(min);
    }

}
