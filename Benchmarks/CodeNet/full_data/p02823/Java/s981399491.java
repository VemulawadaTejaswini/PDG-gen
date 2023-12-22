import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((B - A) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else if ((B - A) % 2 == 1) {
            if (A - 1 > N - B) {
                System.out.println(N - A);
            } else {
                System.out.println(B - 1);
            }
        }
        
    }
}