import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] w = sc.next().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : w){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()% 2 != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
