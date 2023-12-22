import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int j = sc.nextInt();
            if (hash.containsKey(j))hash.put(j,2);
            else hash.put(j,1);
        }
        boolean b = true;
        for (int a : hash.values()){
            if (a > 1) {
                b = false;
                break;
            }
        }
        if (b)System.out.println("YES");
        else System.out.println("NO");
    }
}
