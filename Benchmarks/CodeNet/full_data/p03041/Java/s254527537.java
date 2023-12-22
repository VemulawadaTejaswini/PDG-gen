import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int N = Integer.parseInt(num1);
        int K = Integer.parseInt(num2);
        String str = sc.next();
        char c[] = str.toCharArray();
        
        c[K - 1] = (char) (c[K - 1] - ('A' - 'a'));
        
        for(char ch : c){
            System.out.print(ch);
        }
    }
}
