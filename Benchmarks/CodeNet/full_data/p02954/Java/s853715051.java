import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        int[] children = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            children[i] = 0;
        }

        for (int i = 0; i < s.length; i++) {
            if(s[i] == 'R'){
                for (int j = i + 1; j < s.length; j++) {
                    if(s[j] == 'L') {
                        if((j-i) % 2 == 1){
                            children[j-1]++;
                        } else {
                            children[j]++;
                        }
                        break;
                    }
                }
            } else {
                for (int j = i - 1; j >= 0 ; j--) {
                    if(s[j] == 'R') {
                        if((i-j) % 2 == 1){
                            children[j+1]++;
                        } else {
                            children[j]++;
                        }
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(children[i] + " ");
        }
    }
}

