import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        int max = 0;
        for(int i = 0; i < a; i++){
            String str = sc.next();
            if(hm.containsKey(str)){
                hm.put(str, hm.get(str) + 1);
            }else{
                hm.put(str, 1);
            }
            if(max < hm.get(str)){
                max = hm.get(str);
            }
        }
        for(HashMap.Entry<String,Integer> e : hm.entrySet()){
            if(max == e.getValue()){
                System.out.println(e.getKey());
            }
        }
    }
}
