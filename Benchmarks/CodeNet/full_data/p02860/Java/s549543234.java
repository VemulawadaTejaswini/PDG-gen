import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int count = 0;

        if (N%2 == 0) {
            for (int i = 0; i < N / 2; i++) {
                if (c[i] == c[N/2 + i]) {
                    count++;
                    
                }
            }
                if (count == N / 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }


    }
}