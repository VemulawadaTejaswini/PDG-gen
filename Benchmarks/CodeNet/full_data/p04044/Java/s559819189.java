import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        char[][] s = new char[n][l];

        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
            boolean isAdd = false;
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < i; k++) {
                    if (s[i][j] == s[list.get(k)][j])
                        continue;
                    
                    if (s[i][j] < s[list.get(k)][j]) {
                        list.add(k, i);
                        isAdd = true;
                        break;
                    }
                }
            }
            if (!(isAdd))
                list.add(i);
        }
        
        for (int i = 0; i < n; i++) {
            int index = list.get(i);
            for (int j = 0; j < l; j++) {
                System.out.print(s[index][j]);
            }
        }
    }
}
