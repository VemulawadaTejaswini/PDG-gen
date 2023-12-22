import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = stdIn.nextInt();
        }
        int max = 0;
        int max2 = 0;
        for(int i = 0 ; i < n ;i++) {
            if(a[i] > max) {
                max2 = max;
                max = a[i];
            }else if(a[i] > max2) {
                max2 = a[i];
            }
        }
        for(int i = 0;i < n;i++) {
            if(a[i] < max){
                System.out.println(max);
            }else {
                System.out.println(max2);
            }
        }

    }
}