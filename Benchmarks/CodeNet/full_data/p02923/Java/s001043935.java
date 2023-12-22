import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i < N;i++ ){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < N-1;i++ ){
            if(a[i] < a[i+1]){a[i] = 0;
            }else{a[i] = 1;
            }
        }
        int max = 0;
        int temp = 0;
        for(int i = 0; i < N;i++ ){
            if(a[i] == 1){
                temp += 1;
            }else{
                if(max < temp){
                    max = temp;
                }
                temp = 0;
            }
        }
        System.out.println(max);
    }
}