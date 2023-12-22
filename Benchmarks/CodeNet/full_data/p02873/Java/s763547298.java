import java.util.*;

class Main{
    public static int a[];
    public static String s;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int N = s.length() + 1;
        a = new int[N];
        for(int i = 0;i < N;i++) {
            a[i] = 0;
        }
        for(int i = s.length();i >= 0;i--){ 
            for(int j = 0; j < i; j++) {
                if(check(s.charAt(j)) == 0) {
                    if(!(a[j] < a[j+1])){
                        a[j+1] = a[j] + 1;
                    }
                } else {
                    if(!(a[j] > a[j+1])) {
                        a[j] = a[j] + 1;
                    }
                }
            }
        }
        int sum = 0;
        for(int i = 0;i < N;i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    static int check(char c) {
        if (c == '<') {
            return 0;
         } else {
            return 1;
         }
    }
}