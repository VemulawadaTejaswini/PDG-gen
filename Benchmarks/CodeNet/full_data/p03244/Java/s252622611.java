import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        Map<Integer, Integer> odd = new HashMap();
        Map<Integer, Integer> even = new HashMap();
        for(int i = 0; i < n; i++){
            v[i] = scanner.nextInt();
            if(i%2==0){
                even.put(v[i], even.getOrDefault(v[i], 0)+1);
            }else{
                odd.put(v[i], odd.getOrDefault(v[i], 0)+1);
            }
        }
        int oddsize = 0;
        int evensize = 0;
        
        if(odd.size() == 1 && even.size() == 1 && v[0] == v[1]){
            oddsize = 1;
            evensize = 1;
        }
        else{
            oddsize = odd.size()-1;
            evensize = even.size()-1;
        }
        System.out.println(oddsize+evensize);
    }
}