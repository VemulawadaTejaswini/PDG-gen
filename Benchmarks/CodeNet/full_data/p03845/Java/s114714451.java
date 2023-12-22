import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] normalTime = new int[N];
        for(int n=0;n<N;n++)normalTime[n]=sc.nextInt();
        
        int totalTime =0;
        for(int n=0;n<N;n++)totalTime += normalTime[n];
        
        int M = sc.nextInt();
        for(int m=0;m<M;m++){
        	int qNumber = sc.nextInt();
        	int drinkTime = sc.nextInt();
        	System.out.println(totalTime - normalTime[qNumber-1] + drinkTime);
        }
    }
}