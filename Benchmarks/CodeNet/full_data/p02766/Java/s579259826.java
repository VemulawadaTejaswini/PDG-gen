import java.util.Scanner;

class Main {
    static Scanner sc;
    public static void main(final String[] args) {

        sc = new Scanner(System.in);
        final int N = parseInt();
        final int K = parseInt();

        System.out.println(findBaseK(N, K));

    }

    public static int findBaseK(int n, final int k) {
        if(n==0) return 1;

        int i = 0;
        while(n!=0){
            n = Math.floorDiv(n, k);
            i++;
        }


        return i;
    }

    public static int parseInt(){
        return Integer.parseInt(sc.next());
    }
}