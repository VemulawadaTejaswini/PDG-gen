import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt()-1;
        int[] value = new int[elements];
        for (int i = 0; i < elements; i++) {
            value[i] = sc.nextInt();
        }
        solve(value);
    }

    public static void solve(int[] value){
        int result = value[0] + value[value.length-1];
        for(int i=1; i<value.length; i++){
            result += Math.min(value[i-1],value[i]);
        }
        System.out.println(result);
    }
}