import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("Main.out");

        int n = sc.nextInt();
        int[] sticks = new int[n];
        for(int i = 0; i<n; i++){
            sticks[i] = sc.nextInt();
        }
        Arrays.sort(sticks);
        int diff = 0;
        for(int i = 0; i<n; i++){
            loop : for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(triangle(sticks[i], sticks[j], sticks[k])){
                        diff++;
                        //continue loop;
                    }
                    else{
                        continue loop;
                    }
                }
            }
        }
        System.out.println(diff);
    }

    public static boolean triangle(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        return false;
    }
}