import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;
    Set<String> set = new HashSet<>();
    int K;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] ans = new String[h+2][w+2];

        for(int i=0; i<=h+1; i++){
            if(i == 0 || i == h+1){
                for(int j=0; j<=w+1; j++){
                    ans[i][j] = "#";
                }
            } else {
                char[] array = sc.next().toCharArray();
                for(int j=0; j<=w+1; j++){
                    if(j == 0 || j == w+1){
                        ans[i][j] = "#";
                    } else {
                        ans[i][j] = String.valueOf(array[j-1]);
                    }
                }
            }
        }

        for(int i=0; i<=h+1; i++){
            for(int j=0; j<=w+1; j++){
                if(j == w+1){
                    System.out.println(ans[i][j]);
                } else {
                    System.out.print(ans[i][j]);
                }
            }
        }
    }

    void substring(String s, int num){
        for(int i=1; i<=num; i++){
            if(i > K){
                break;
            }
            for(int j=0; j<num; j++){
                if(j + i-1 < num){
//                    System.out.println(s.substring(j, j+i));
                    set.add(s.substring(j, j+i));
                } else {
                    break;
                }
            }
        }
    }

    void permutation(String s, String ans){
        if(s.length() <= 1){
            System.out.println(ans + s);
        } else {
            for(int i=0; i<s.length(); i++){
                permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }
}