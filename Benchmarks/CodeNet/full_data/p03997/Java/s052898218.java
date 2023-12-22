import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daikeihen = new int[3];
        for(int i = 0;i <= 2; i++){
      	daikeihen[i] = sc.nextInt();
        }System.out.println((daikeihen[0] + daikeihen[1]) * daikeihen[2] / 2);
    }
}
