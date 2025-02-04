
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] in = sc.nextLine().split(" ");
        List<Integer> ints = new ArrayList<Integer>();
        for(String str : in){
            ints.add(Integer.parseInt(str));
        }
        ints.sort(Comparator.reverseOrder());
        long r = 0;
        long prevC = -1;
        for(int ia = 0;ia < n;ia++){
            int a = ints.get(ia);
            for(int ib = ia + 1;ib < n;ib++) {
                int b = ints.get(ib);
                if(prevC != -1) {
                    if (a >= b + prevC) {
                        break;
                    }
                }
                for (int ic = ib + 1; ic < n; ic++) {
                    int c = ints.get(ic);
                    prevC = c;
                    if (a < b + c) {
                        if (b < c + a) {
                            if (c < a + b) {
                                r++;
                            }else{
                                break;
                            }
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(r);
    }
}