import java.util.*;
public class Main {
    public static void main(String[] args){
        int n,m,total = 0;
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> t = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            total += tmp;
            t.add(tmp);
        }
        m = sc.nextInt();
        
        for(int i = 0; i < m; i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            p--;
            System.out.println(total - (t.get(p)-x));
        }
        sc.close();
    }
}