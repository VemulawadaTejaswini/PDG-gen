import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void scanArray(Scanner sc ,int[] array, int num){
        for(int i =0;i<num;i++){
            array[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {

        int N;
        int L;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            L = sc.nextInt();

        }
        int min = L;
        int sum = 0;
        for(int i = 0 ;i < N;i++){
            int d = L + i;
            sum += d;
            if(Math.abs(min) > Math.abs(d)){
                min = d;
            }
        }
        System.out.println(sum -min);
    }
}
