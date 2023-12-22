import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String text = scanner.next();
        ROT(n, text);
    }


    public static void ROT(int n, String text){
        for(int i = 0; i < text.length(); i++){
            int s;
            char q;
            s = text.charAt(i) + n;
            if(s > 90){
                int f = s - 91;
                s = f + 65;
            }
            q = (char) s;
            System.out.print(q);
        }

    }