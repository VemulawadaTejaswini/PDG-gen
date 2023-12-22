import java.util.*;
 
public class Main{

       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int K = sc.nextInt();
        sc.close();
        Map<String, Integer> sub = new HashMap<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                if(!(sub.containsKey(s.substring(i, j)))){
                    count++;
                    sub.put(s.substring(i, j), count);
                }
            }
        }
        String[] subst = new String[count];
        for (String key : sub.keySet()) {
            subst[sub.get(key)-1] = key;
        }
        Arrays.sort(subst);
        System.out.println(subst[K-1]);
    }
}