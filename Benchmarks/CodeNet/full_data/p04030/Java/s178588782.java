
import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'B'){
                list.add(s.charAt(i));
            }else if(list.size() != 0){
                list.remove(list.size()-1);
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}