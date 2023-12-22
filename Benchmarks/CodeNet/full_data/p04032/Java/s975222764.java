import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int size = N.length();
        char[] a = N.toCharArray();
        int result1 = -1;
        int result2 = -1;
        
        out:for(int i=0;i<size-1;i++){
            Map<Character,Integer> map = new HashMap<>();
            map.put(a[i],1);
            int max = 1;
            for(int j=i+1;j<size;j++){
                if(map.get(a[j]) == null){
                    map.put(a[j],1);
                }else{
                    int x = map.get(a[j]) + 1;
                    map.put(a[j],x);
                    max = Math.max(max,x);
                }
                if(i!=j&&max > (j-i+1)/2 ){
                    result1 = i+1;
                    result2 = j+1;
                    break out;
                }
            }
        }
        

        System.out.println(result1+" "+result2);
    }
    
    
}
