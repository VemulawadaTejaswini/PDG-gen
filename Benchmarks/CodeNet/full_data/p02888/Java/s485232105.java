import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(l);
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(l[i]);
        }
        
        int ans = 0;
        for(int a = 0; a < n-2; a++){
            for(int b = a+1; b < n-1; b++){
                int x = lowerBound(list, b+1, n, l[a]+l[b]);
                ans += x - (b+1);
            }
        }
        
        System.out.println(ans);
    }
    
    private static int lowerBound(List<Integer> list, int from, int to, int key){
        
        Comparator<Integer> c = (Integer o1, Integer o2) -> {
            return (o1.compareTo(o2) >= 0) ? 1 : -1;
        };
        
        int index = ~Collections.binarySearch(list, key, c);
        if(index < from){
            index = from;
        }else if(index > to){
            index = to;
        }
        
        return index;
    }
}