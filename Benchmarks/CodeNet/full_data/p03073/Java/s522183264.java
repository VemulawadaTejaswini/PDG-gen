
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] l = s.toCharArray();
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < l.length; i++){

            int dc1 = i % 2;
            int dc2 = (i + 1) % 2;

            if(l[i] - '0' != dc1) c1++;
            if(l[i] - '0' != dc2) c2++;
        }
        System.out.println(Math.min(c1,c2));

    }

    public static void q1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < N; i++){
            l.add(sc.nextInt());
        }
        int max = -1;
        int count = 0;
        for (int i = 0; i < l.size();i++){
            if (l.get(i) >= max){
                count++;
            }
            max = Math.max(max,l.get(i));
        }
        System.out.println(count);
    }
}
