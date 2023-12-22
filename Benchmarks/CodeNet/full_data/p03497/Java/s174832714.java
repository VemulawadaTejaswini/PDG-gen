import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] li = new int[200001];
        for(int i = 0; i < n; i++){
            li[sc.nextInt()]++;
        }
        ArrayList<Balls> bl = new ArrayList<Balls>();
        for(int i = 0; i < 200001; i++){
            if(li[i] == 0) continue;
            bl.add(new Balls(i, li[i]));
        }
        Collections.sort(bl);
        int ans = 0;
        int len = bl.size()-k;
        for(int i = 0; i < len; i++){
            ans += bl.get(i).count;
        }
        System.out.println(ans);
    }
}

class Balls implements Comparable<Balls>{
    int kind, count;
    public Balls(int k, int c){
        this.kind = k;
        this.count = c;
    }
    
    public int compare(Balls b1, Balls b2){
        if(b1.count < b2.count){
            return -1;
        }else if(b1.count > b2.count){
            return 1;
        }else{
            return 0;
        }
    }
    
    public int compareTo(Balls b){
        if(this.count < b.count){
            return -1;
        }else if(this.count > b.count){
            return 1;
        }else{
            return 0;
        }
    }
}
