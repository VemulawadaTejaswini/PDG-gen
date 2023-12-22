import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            l.add(Integer.parseInt(sc.next()));
        }
        
        Collections.sort(l, Comparator.reverseOrder());
        
        int ans = 0;
        for(int i=0; i<K; i++){
            ans += l.get(i);
        }
        
        System.out.println(ans);
    }
}