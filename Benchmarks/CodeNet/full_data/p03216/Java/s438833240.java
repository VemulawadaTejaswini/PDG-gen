import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int q = sc.nextInt();

        int[] k = new int[q];

        for(int i = 0; i < q ; i++){
            k[i] = sc.nextInt();
        }

        sc.close();        
        
        int idx  = 0;
        int bmin = s.indexOf('M');
        int bmax = s.lastIndexOf('M');

        //System.out.println("bmax-min " + bmax + " " + bmin);

        char[] chars = {'D','M','C'};

        ArrayList<ArrayList<Integer>> clist = new ArrayList<ArrayList<Integer>>();
        for (char c : chars) {
            idx = 0;
            ArrayList<Integer> tlist = new ArrayList<Integer>();
            while(true){
                int tmp = s.indexOf(c,idx);
                if (tmp < 0){
                    break;
                }else{
                    tlist.add(tmp);
                }
                idx = tmp + 1;
            }
            clist.add(tlist);
        }
        Collections.sort(clist.get(1));
        Collections.sort(clist.get(2));
        Collections.reverse(clist.get(2));

        ArrayList<Integer> aclen = new ArrayList<Integer>();
        ArrayList<Integer> bclen = new ArrayList<Integer>();
        int count = 0;
        for (int c : clist.get(2)) {
            if (bmin < c){
                for(int a: clist.get(0)){
                    if(bmax > a){
                        int bcount = 0;
                        for(int b : clist.get(1)){
                            if ( a < b && b < c){
                                bcount++;
                            }
                        }
                        aclen.add(c-a);
                        bclen.add(bcount);
                    }
                }
            }
        }

        for(int lk : k ){
            count = 0;
            for(int i = 0; i < aclen.size(); i++){
                if(aclen.get(i) < lk){
                    count += bclen.get(i);
                }                
            }
            System.out.println(count);
        }
    }
}

