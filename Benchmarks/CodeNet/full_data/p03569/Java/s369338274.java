import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();
        int length = s.length;
        List<Character> non_n = new ArrayList<>();
        for( char tmp : s) {
            if (tmp != 'x') {
                non_n.add(tmp);
            }
        }
        int x_num = length - non_n.size();

        for (int i = 0; i < non_n.size(); i++) {
            if(non_n.get(i).equals(non_n.get(non_n.size() - i - 1))){

            }
            else {
                System.out.println("-1");
                return;
            }
        }

        int tail = s.length -1;
        int sorted = 0;
        for (int i = 0; i < s.length / 2;) {
            if(i == tail) {
                break;
            }
            if(s[i] == s[tail]) {
                if(s[i] == 'x') {
                    sorted += 2;
                }
                i++;
                tail--;
            }
            else if(s[tail] == 'x') {
                tail--;
            } else if(s[i] == 'x'){
                i++;
            } else  {
                tail--;
                i++;
            }
        }
        System.out.println(x_num - sorted);
    }
}
