import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 0;

        for (int i = n; i != 0;i--){
            total += n;
            n--;
        }

        System.out.println(total);

        }
}