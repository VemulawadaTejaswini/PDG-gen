import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split("");
        boolean res = false;
        boolean isRemoving = false;
        boolean isFirstRemoving = true;
        int index = 0;
        String secondStart = "";
        String[] keyence = {"k", "e", "y", "e", "n", "c", "e"};

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (isRemoving) {
                if (s.equals(keyence[index])) {
                    secondStart = s;
                    index++;
                    isRemoving = false;
                } 
            } else {
                if (s.equals(keyence[index])) {
                    index++;
                    if (index == 7) {
                        if (isFirstRemoving || i == arr.length - 1) {
                            res = true;
                            break;
                        } else {
                            res = false;
                            break;
                        }
                    }
                } else if (s.equals(secondStart)) {
                    // do nothing;
                } else {
                    if (isFirstRemoving) {
                        isRemoving = true;
                        isFirstRemoving = false;
                    } else {
                        res = false;
                        break;
                    }
                }
            }
        }
        out.println(res ? "YES" : "NO");
        out.close();
    }
}
