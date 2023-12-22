import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] yosou = sc.next().toCharArray();
        char[] zissai = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < yosou.length; i++) {
            if (yosou[i] == zissai[i])
                count++;
        }

        System.out.println(count);
    }
}