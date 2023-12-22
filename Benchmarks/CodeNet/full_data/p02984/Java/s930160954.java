import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] b = new long[n];
        long[] r = new long[n];

        for(int i = 0;i < n;i++) {
            b[i] = stdIn.nextLong() * 2;
        }

        r[0] = 0;
        for(int i = 0; i < n;i++) {
            if(i % 2 == 0) {
                r[0] += b[i];
            }else {
                r[0] -= b[i];
            }
        }
        r[0] /= 2;

        for(int i = 1; i < n;i++) {
            r[i] = b[i-1] - r[i-1];
        }

    
       

        for(long i : r) {
            System.out.print(i);
        }
        
        
    }
}

