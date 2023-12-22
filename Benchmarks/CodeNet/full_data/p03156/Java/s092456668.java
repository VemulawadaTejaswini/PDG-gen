import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[3];
        for(int i=0; i<n; i++){
            int p = sc.nextInt();
            if(p <= a){
                num[0]++;
            }else if(p <= b){
                num[1]++;
            }else{
                num[2]++;
            }
        }

        System.out.println(Arrays.stream(num).min().getAsInt()
        );
    }
}