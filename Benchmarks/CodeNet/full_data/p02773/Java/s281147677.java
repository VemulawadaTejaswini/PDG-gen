import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Long> l = new ArrayList<Long>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int temp = list.indexOf(s);
            if(temp == -1){
                list.add(s);
                l.add(new Long(1));
            }else{
                l.set(temp, l.get(temp) +1);
            }
        }
        long max = 0;
        for(long lo : l){
            if(max < lo){
                max = lo;
            }
        }
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i < l.size(); i++){
            if(max == l.get(i)){
                ans.add(list.get(i));
            }
        }
        Collections.sort(ans);
        for(String s: ans){
            System.out.println(s);
        }
        
    }
}