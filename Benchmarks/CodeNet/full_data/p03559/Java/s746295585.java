import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> bl = new ArrayList<Integer>();
        List<Integer> cl = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            bl.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            cl.add(sc.nextInt());
        }
        Collections.sort(al);
        Collections.sort(bl);
        Collections.sort(cl);
        int t = 0;
        int d = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            while(t < n && al.get(t) < bl.get(i)){
                t++;
            }
            while(d < n && bl.get(i) >= cl.get(d) ){
                d++;
            }
            ans += t * (n-d);
        }
        System.out.println(ans);
    }
}
