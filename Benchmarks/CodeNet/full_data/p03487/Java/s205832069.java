import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            list.add(a[i]);
        }
        Collections.sort(list);

        int ans = 0;
        int v = list.get(0);
        int x = 0;
        for(int i=0; i<N-1; i++){
            x += 1;
            if(list.get(i)!=list.get(i+1)){
                if(x>v){
                    ans += x - v;
                }
                else if(x<v){
                    ans += x;
                }
                x = 0;
                v = list.get(i + 1);
            }
            if(i==N-2){
                x += 1;
                if(x>v){
                    ans += x - v;
                }
                else if(x<v){
                    ans += x;
                }
            }

        }
        if(N==1 && a[0]!=1){
            ans += 1;
        }
        System.out.println(ans);
    }
}