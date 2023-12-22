import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] a = new int[N];;
        for(int i = 0 ; i < N ; i++) {
            a[i] = Integer.parseInt(stdR.readLine());
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a[N - 1]);
        for(int i = N - 2 ; i >= 0 ; i--) {
            int index = binarySearch(list, a[i]);
            if(index == -1) {
                list.add(a[i]);
            }else {
                list.set(index, a[i]);
            }
        }
        System.out.println(list.size());
    }
    public static int binarySearch(ArrayList<Integer> S, int X) {
        int pLeft = 0;
        int pRight = S.size() - 1;

        do {
            int center = (pLeft + pRight) / 2;
            //System.out.println("center:"+center+","+X+","+S.get(center));
            if (X < S.get(center)) {
                if(center == 0) {
                    return center;
                }else if(X < S.get(center - 1)) {
                    pRight = center - 1;
                }else {
                    return center;
                }
            }else {
                pLeft = center + 1;
            }
        } while (pLeft <= pRight);
        return -1;
    }
}
