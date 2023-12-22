import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n*3; i++){
            al.add(sc.nextInt());
        }
        Collections.sort(al, Comparator.reverseOrder());
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += al.get(i*2+1);
        }
        System.out.println(ans);
    }
}
