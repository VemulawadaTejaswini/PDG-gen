import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        int ans = 0;
        for(Integer key : map.keySet()){
            ans += C(map.get(key),2);
        }
        for(int i = 0; i < n; i++){
            System.out.println((ans - map.get(a[i])+1));
        }
    }
    public static int C(int n, int r){
        if(n == 0){return 0;}
        if(r == 1){return n;}
        return C(n-1, r-1) + C(n-1,r);
    }
}

