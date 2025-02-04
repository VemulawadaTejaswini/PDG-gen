import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            String anagrams = String.join("", arrS);
            s.add(anagrams);
        }

        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < s.size(); j++) {
                if (s.get(i).equals(s.get(j))) {
                    count++;
                    s.remove(j);
                    j--;
                }
            }
            while(count != 0){
                result += count;
                count--;
            }
        }

        System.out.println(result);
    }
}