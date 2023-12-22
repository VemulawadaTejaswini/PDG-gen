import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] v = new int[N];
        double ans = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        ans = list.get(0);

        for(int i=1; i<N; i++){
            ans = (ans + list.get(i)) / 2;
        }

        if(ans==(int)ans)
        System.out.println((int)ans);
        else if(ans!=(int)ans)
        System.out.println(ans);
    }
}