import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> si = new HashSet<>();
        si.add(s);
        int x=2;
        while(true) {
            if(0==s%2) {
                s/=2;
            } else {
                s = s * 3 + 1;
            }
            if(si.contains(s)) break;
            si.add(s);
            x++;
        }
        System.out.println(String.format("%d", x));
    }
}
