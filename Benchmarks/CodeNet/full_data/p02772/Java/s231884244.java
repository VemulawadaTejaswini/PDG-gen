import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] a = new int[1000];

        for (int i = 0; i<N; i++){
            a[i] = stdIn.nextInt();
        }
        
        int flag_even = 0;
        int flag_out = 0;
        for (int j=0; j<N; j++){
            if (a[j]%2 == 0) {
                if (a[j]%3 == 0 || a[j]%5 == 0) {
                    flag_even = 1;
                }else {
                    falg_out = 1;
                    break;
                }
            }
        }

        if (flag_A == 1 && flag_out != 1){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}