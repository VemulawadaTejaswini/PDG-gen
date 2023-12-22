

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ar = Arrays.stream(sc.next().split("")).collect(Collectors.toList());

        String temp = ar.get(0);
        String ansStr = temp;
        for (int i = 1; i < ar.size(); i++) {
            if (!ar.get(i).equals(temp)) {
                temp = ar.get(i);
                ansStr += temp;
            }
        }

        System.out.println(ansStr.length());
        sc.close();
    }
}