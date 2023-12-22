import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> have = new HashMap<>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            have.put(d,have.getOrDefault(d,0)+1);
        }
        int m = sc.nextInt();
        HashMap<Integer,Integer> need = new HashMap<>();
        for(int i=0;i<m;i++){
            int D = sc.nextInt();
            need.put(D,need.getOrDefault(D,0)+1);
        }
        boolean flag = true;
        for(int w:need.keySet()){
            flag &= need.get(w)<=have.getOrDefault(w,-1);
        }
        String ans = flag?"YES":"NO";
        System.out.println(ans);
    }
}
