import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int sumatory(String a, String b){
        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < b.length(); j++){
                if (lista.contains(a.charAt(i))) continue;
                if (a.charAt(i) == b.charAt(j)){
                    lista.add(a.charAt(i));
                    break;
                }
            }
        }
        return lista.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        String str = in.next();
        int start = 0, end = n;
        int max = 0;
        for (int i = 0; i < n; i++){
            String str1 = str.substring(start, i);
            String str2 = str.substring(i, end);
            max = Math.max(max, sumatory(str1, str2));
        }
        System.out.println(max);
    }

}