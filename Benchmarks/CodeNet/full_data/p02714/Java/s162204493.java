import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }



    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();

        String s;
        ArrayList<Integer> rlist = new ArrayList<>();
        ArrayList<Integer> glist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            s = String.valueOf(S.charAt(i));
            if(s.equals("R")){
                rlist.add(i+1);
            }
            else if(s.equals("G")){
                glist.add(i+1);
            }
            else if(s.equals("B")){
                blist.add(i+1);
            }
        }
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: rlist){
            for(int j: glist){
                for(int k: blist){
                    int[] a = {i, j, k};
                    int min, mid, max;
                    Arrays.sort(a);
                    min = a[0];
                    mid = a[1];
                    max = a[2];
                    if(Math.abs(mid - min) != Math.abs(max - mid)){
                        sum += 1;
                    }
                    
                    
        
                }
            }
        }
        System.out.println(sum);

    }

}    

