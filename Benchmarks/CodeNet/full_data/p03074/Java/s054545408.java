import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), K = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ans = 0;
        List<Integer> lbs = new ArrayList<>(), rbs = new ArrayList<>();
        for (int i=0; i<s.length(); ++i) {
            if (s.charAt(i)=='0') {
                if (i==0||s.charAt(i-1)=='1') {
                    lbs.add(i);
                }
                if (i==s.length()-1||s.charAt(i+1)=='1') {
                    rbs.add(i);
                }
            }
        }
        if (lbs.size()<=K) {
            ans = s.length();
        } else {
            ans = Math.max(lbs.get(K), s.length()-rbs.get(rbs.size()-K-1)-1);
            for (int i=K+1; i<lbs.size()-1; ++i) {
                ans = Math.max(ans, lbs.get(i)-rbs.get(i-K-1)-1);
            }
        }
        System.out.println(ans);
    }
}
