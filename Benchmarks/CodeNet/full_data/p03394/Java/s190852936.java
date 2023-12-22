import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        int cnt = 0;
        long sum = 0L;
        for (int i=1;i<30000;i++) {
            if (i%2==0 || i%3==0 || i%5==0) {
                set.add(i);
                sum+=i;
                cnt++;
            }
            if (cnt==N-2) break;
        }

        for (int i=1;3*i<30000;i++) {
            if (set.contains(3*i)) continue;
            if ((sum+3*i)%5!=0) continue;
            set.add(3*i);
            sum+=3*i;
            break;
        }

        for (int i=1;5*i<30000;i++) {
            if (set.contains(5*i)) continue;
            if ((sum+5*i)%3!=0 || (sum+5*i)%2!=0) continue;
            set.add(5*i);
            sum+=5*i;
            break;
        }

        ArrayList<Integer> ans = new ArrayList<Integer>(set);
        for (int i=0;i<ans.size();i++) {
            if (i!=ans.size()-1) {
                System.out.print(ans.get(i));
            } else {
                System.out.println(ans.get(i));
            }
            if (i!=ans.size()-1) System.out.print(" ");
        }
        // System.out.println(set);
    }
}