import java.util.Scanner;
public class Main {
    static int R;
    static int S;
    static int P;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        R = sc.nextInt();
        S = sc.nextInt();
        P = sc.nextInt();
        String s = sc.next();
        char[] array = s.toCharArray();
        int[] array1 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (array[i] == 'r')
                array[i] = 'p';
            else if (array[i] == 's')
                array[i] = 'r';
            else
                array[i] = 's';
        }
        for (int i = 0; i < s.length(); i++) {
            array1[i] = getPrice(array[i]);
        }
        for (int i = 0; i < s.length() - k; i++) {
            if (array1[i] == array1[i + k] && array1[i] != 0) {
                array1[i+k] = 0;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            result += array1[i];
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(array1[i]);
        }
        System.out.println(result);
    }
        public static int getPrice(char n){
            if(n=='r')
                return R;
            else if (n=='s')
                return S;
            else
                return P;
        }
    }