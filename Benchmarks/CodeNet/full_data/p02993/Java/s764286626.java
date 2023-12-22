import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        int[] n = new int[4];

        String[] str = s.split("");
        for(int i = 0; i < 4;i++) {
            n[i] = Integer.parseInt(str[i]);
        }

        if(n[0] != n[1] && n[1] != n[2] && n[2] != n[3]) {
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }
    }
}