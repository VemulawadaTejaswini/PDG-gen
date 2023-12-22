import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float possibility = (float)((N / 2) + 1) / N;

        if (N%2 == 1) {
            System.out.println(possibility);
        } else {
            System.out.println(0.5000000000);
        }
    }
}