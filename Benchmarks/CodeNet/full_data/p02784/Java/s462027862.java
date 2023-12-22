import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int s = 0;
        for(int i = 0; i < N ;i++){
            s += Integer.parseInt(sc.next());
        }
        if(s >= H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}