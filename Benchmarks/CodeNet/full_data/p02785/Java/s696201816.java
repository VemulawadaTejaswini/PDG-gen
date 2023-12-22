import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int i = 0;i<k;i++){
            list.remove(i);
        }
        long ans = 0;
        for(int i = 0;i<list.size();i++){
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}