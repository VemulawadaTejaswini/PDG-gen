import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] str = scan.next().split("");
        List<String> strings = new ArrayList<>();
        for (int i = 0 ; i  < str.length; i++){
            strings.add(str[i]);
        }

        boolean ok = true;
        while (ok){
            String tmp = null;
            for (int i = 1; i < strings.size(); i++){
                tmp = strings.get(i-1);
                if (tmp.equals("S") && strings.get(i).equals("T")){
                    strings.remove(i);
                    strings.remove(i-1);
                    break;
                }
                if (i == strings.size() -1){
                    ok = false;
                }
            }
            if (strings.size() == 0) break;

        }
        System.out.println(strings.size());
    }
}