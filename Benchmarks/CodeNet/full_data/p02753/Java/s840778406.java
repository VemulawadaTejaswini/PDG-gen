import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<Character> cha = new ArrayList<>();
        for(char c: str.toCharArray()){
            cha.add(c);
        }

        String out = new String();
        if(cha.contains('A')&&cha.contains('B')) {
            out = "Yes";
        } else {
            out = "No";
        }

        System.out.println(out);
        sc.close();
    }
}