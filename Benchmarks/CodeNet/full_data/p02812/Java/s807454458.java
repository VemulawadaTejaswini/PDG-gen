import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int tmp=0;int result=0;
        String s = sc.next();
        char[] array = s.toCharArray();
        for (int i = 0; i < n-3; i++) {
            if(array[i]=='A') {
                tmp++;
                if (array[i + 1] == 'B' && tmp == 1) {
                    tmp++;
                    if (array[i + 2] == 'C' && tmp == 2)
                        tmp++;
                }
            }
            if(tmp==3) {
                result++;
                tmp=0;
            }
            tmp=0;
        }
        System.out.println(result);
    }
}