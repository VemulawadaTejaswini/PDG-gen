import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        if(s.length() % 2 != 0){
            System.out.println("No");
            System.exit(0);
        }
        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < s.length();i++){
            sb.setLength(0);
            sb.append(s.charAt(i));
            if(map.get(sb.toString()) == null){
                map.put(sb.toString(),1);
            }
            else if(map.get(sb.toString()).intValue() < 2){
                map.put(sb.toString(),2);
            }
            else{
                System.out.println("No");
                System.exit(0);
            }
        }
        if(map.size() != s.length() / 2){
            System.out.println("No");
            System.exit(0);
        }
        else{
            System.out.println("Yes");
            System.exit(0);
        }
    }
}
