

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] k = new int[m];
        List<List<Integer>> sw = new ArrayList<>();
        int[] p = new int[m];
        for(int i=0;i<m;i++){
            k[i] = Integer.parseInt(sc.next());
            sw.add(new ArrayList<>());
            for(int j=0;j<k[i];j++){
                sw.get(i).add(Integer.parseInt(sc.next())-1);
            }
        }
        for(int i=0;i<m;i++){
            p[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int temp;
        int count = 0;
        boolean flag = true;
        int res = 0;
        for(int i=0;i<1<<n;i++){
            flag = true;
            for(int j=0;j<m;j++){
                count = 0;
                for(int l=0;l<k[j];l++){
                    temp = sw.get(j).get(l);
                    if(((i>>temp) & 1)==1){
                        count++;
                    }
                }
                if(count%2!=p[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res++;
            }

        }
        System.out.println(res);
    }
}