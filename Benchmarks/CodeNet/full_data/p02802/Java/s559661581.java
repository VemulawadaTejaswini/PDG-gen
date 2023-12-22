import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] question = new int[n];
        boolean[] cleared = new boolean[n];
        int clearedQuestions = 0;
        int q;
        boolean ac;
        for(int i=0; i<m; i++){
            q = sc.nextInt()-1;
            ac = sc.next().equals("AC");
            if(cleared[q]) continue;
            if(ac){
                cleared[q] = true;
                clearedQuestions++;
            }else{
                question[q]++;
            }
        }
        int penalties = 0;
        for(int i : question){
            penalties += i;
        }
        System.out.println(clearedQuestions+" "+penalties);
    }
}