import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string = in.readLine();
            char[] array = string.toCharArray();
            int res = 0;
            for (int i = 1; i < string.length(); i++) {
                if (array[i] == array[i-1]) {
                    if (array[i] == '0') {
                        array[i] = '1';
                    } else {
                        array[i] = '0';
                    }
                    res++;
                }
            }
            System.out.println(res);
        } catch (IOException ex) {

        }
    }

}