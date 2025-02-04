import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String strArr[] = new String[n];
            for (int i = 0; i < n; i++) {
                strArr[i] = br.readLine();
            }
            for (int i = 0; i < 26; i++) {
                boolean flag = true;
                int min = 0;
                for (int j = 0; j < n; j++) {
                    int temp = getCharCount(strArr[j], alpha[i]);
                    if (flag || min > temp) {
                        min = temp;
                        flag = false;
                    }
                }
                if (min > 0) {
                    for (int k = 0; k < min; k++) {
                        System.out.print(alpha[i]);
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getCharCount(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }
}