import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        int i = 0;
        while(i < N){
            a[i] = sc.nextInt();
            i++;
        }
        int alice = 0;
        int bob = 0;
        int j = 0;
        Arrays.sort(a, Comparator.reverseOrder());
        for(int ai: a){
            if(j % 2 == 0){
                alice += ai;
            }else{
                bob += ai;
            }
            j++;
        }
        System.out.println(alice - bob);
    }
}
