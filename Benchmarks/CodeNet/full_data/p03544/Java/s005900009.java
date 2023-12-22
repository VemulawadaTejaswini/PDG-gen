import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = lucas(n);
        System.out.println(ans);
    }
    static Map<Integer, Integer> map = new HashMap<>();
    static int lucas(int a){
        if(a == 0) return 2;
        if(a == 1) return 1; 
        Integer m = map.get(a);
        //メモしてたらそこから出す。
        if(m != null) {
            return m;
        }
        //メモされてなかった(初めて計算する)ので計算しメモる。
        m = lucas(a-1) + lucas(a-2);
        map.put(a,m);
        return m;
    }
}