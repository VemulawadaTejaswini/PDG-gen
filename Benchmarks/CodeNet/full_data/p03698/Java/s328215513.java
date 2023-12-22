import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char n[]=new char[N.length()];
        for(int i=0;i<N.length();i++){
            n=N.toCharArray();
        }
        Arrays.sort(n);
        for(int i=1;i<N.length();i++){
            if(n[i]==n[i-1]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
