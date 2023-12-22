import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        int idx = 0;

        int ans = 0;

        while (idx!=list.size()){
            if (list.get(idx)!=idx+1){
                list.remove(idx);
                ans++;
            }else {
                idx++;
            }
        }

        if (ans==n){
            System.out.println(-1);
        }else {
            System.out.println(ans);
        }





    }

}
