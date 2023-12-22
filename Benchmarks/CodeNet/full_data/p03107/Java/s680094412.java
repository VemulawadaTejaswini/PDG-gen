import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        ArrayList<Character> array = new ArrayList<>();
        for (int i=0;i<s.length();i++)array.add(s.charAt(i));
        while (count<array.size()-1){
            if ((array.get(count)!=array.get(count+1))){
                array.remove(count);
                array.remove(count);
                count=0;
            }else {
                count++;
            }
        }
        System.out.println(s.length()-array.size());
    }
}
