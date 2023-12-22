import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        char[] original = name.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        result.add(original[0]);
        for (int i = 1; i < N; i++) {
            if(result.get(result.size()-1) == original[i]){
                continue;
            }
            else
                result.add(original[i]);
        }

        System.out.println(result.size());
    }
}
