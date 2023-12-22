import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        long two_sum = 0L;
        for (int i=0;i<N-N/3*2;i++) {
            set.add(2*(i+1));
            two_sum+=2*(i+1);
        }
        int cnt = 0;
        int three_i = 0;
        long three_sum = 0L;
        while (cnt<N/3-1) {
            if (3*(three_i+1)%2!=0 && !set.contains(3*(three_i+1))) {
                set.add(3*(three_i+1));
                three_sum+=3*(three_i+1);
                cnt++;
            }
            three_i++;
        }
        cnt = 0;
        int five_i = 0;
        long five_sum = 0L;
        while (cnt<N/3-1) {
            if (5*(five_i+1)%2!=0 && !set.contains(5*(five_i+1))) {
                set.add(5*(five_i+1));
                five_sum+=5*(five_i+1);
                cnt++;
            }
            five_i++;
        }
        three_sum%=5;
        five_sum%=3;

        while (3*(three_i+1)%2==0 || set.contains(3*(three_i)+1) || (two_sum%5+three_sum%5+3*(three_i+1))%5!=0) {
            three_i++;
        }
        set.add(3*(three_i+1));
        while (5*(five_i+1)%2==0 || set.contains(5*(five_i)+1) || (two_sum%3+five_sum%3+5*(five_i+1))%3!=0) {
            five_i++;
        }
        set.add(5*(five_i+1));
        ArrayList<Integer> ans = new ArrayList<Integer>(set);
        for (int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i));
            if (i!=ans.size()-1) System.out.print(" ");
        }
        // System.out.println(set);
    }
}