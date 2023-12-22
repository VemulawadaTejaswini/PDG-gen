import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        if ((B - A) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else if ((B - A) % 2 == 1) {
            if (A - 1 >= N - B) {
                System.out.println(N - A);
            } else {
                System.out.println(B - 1);
            }
        }
        
    }
}