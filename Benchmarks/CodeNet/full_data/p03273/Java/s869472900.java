import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        ArrayList<String> a = new ArrayList<String>(h);
        for(int i = 0; i < h; i++){
            a.add(sc.next());
        }
        for(int i = 0; i < a.size(); i++){
            int n = 0;
            for(int j = 0; j < a.get(0).length(); j++){
                if (a.get(i).charAt(j) == '.') {
                    n++;
                }
            }
            if (n == w) {
                a.remove(i);
                i--;
            }
        }
        for(int j = 0; j < a.get(0).length(); j++){
            int n = 0;
            for(int i = 0; i < a.size(); i++){
                if (a.get(i).charAt(j) == '.') {
                    n++;
                }
            }
            if (n == a.size()) {
                for(int i = 0; i < a.size(); i++){
                    int l = a.get(i).length();
                    a.set(i, a.get(i).substring(0, j)+a.get(i).substring(j+1, l));
                }
                j--;
            }
        }
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}