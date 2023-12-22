import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i]) + b[i]);
            } else {
                hm.put(a[i], b[i]);
            }
        }
        List<Integer> sortedKeys = new ArrayList<Integer>(hm.keySet());
        Collections.sort(sortedKeys);
        long cout = 0;
        for(int key : sortedKeys){
            cout += hm.get(key);
            if(cout >= k){
                System.out.println(key);
                break;
            }
        }
    }
}
