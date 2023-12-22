import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] prepreChildren = new int[N];
        int[] preChildren = new int[N];
        int[] nextChildren = new int[N];
        for (int i=0; i<N; i++) {
            prepreChildren[i] = 1;
            preChildren[i] = 1;
            nextChildren[i] = 1;
        }
        int times = 0;
        for (int i=0; i<100000; i++) {
            for (int j=0; j<N; j++) {
                char s = S.charAt(j);
                if (s == 'R') {
                    nextChildren[j+1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                } else {
                    nextChildren[j-1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                }
            }
            if(Arrays.equals(nextChildren, prepreChildren)) {
                times += 1;
            }

            if(times > 1) {
                break;
            }
            prepreChildren = preChildren.clone();
            preChildren = nextChildren.clone();
        }
        for (int i=0; i<N; i++) {
            System.out.print(nextChildren[i]);
            System.out.print(" ");
        }
    }
}