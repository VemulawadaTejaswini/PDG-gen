import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        Stack<Integer> st = new Stack<>();
        int min=200001;
        int cnt=0;
        for(int i=0;i<N;i++){
            int p = sc.nextInt();
            if(p < min){
                min = p;
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}