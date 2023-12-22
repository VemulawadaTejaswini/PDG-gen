import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        int first = 0;
        int second = 0;
        for(int i=0;i<N;i++){
            int k = scan.nextInt();
            if(!set.contains((Object)k)){
                set.add(k);
            }else{
                if(k == first || k == second) continue;
                if(k>first){
                    second = first;
                    first = k;
                }else {
                    if (k > second) {
                        second = k;
                    }
                }
            }
        }
        System.out.println(first*second);
    }
}