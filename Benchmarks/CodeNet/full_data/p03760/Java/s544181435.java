
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length() + b.length() - 2; i++) {
            if (count == 0) {
                System.out.print(charArray1[i]);
                System.out.print(charArray2[i]);
                if (charArray1[i] == (charArray1[a.length()-1])) {
                    count = 1;
                } else if (charArray2[i] == (charArray2[b.length()-1])) {
                    count = 2;
                }
            } else if (count == 1) {
                System.out.print(charArray2[i]);
            } else if (count == 2) {
                System.out.print(charArray1[i]);    
            }
        }
        System.out.println("");
    }
}
