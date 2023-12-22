import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ques[] = new int[N];
        int correct = 0;
        int penalties = 0;
        for(int i=0; i<M; i++){
            int prob= sc.nextInt();
            String verdict= sc.next();
            if(ques[prob-1]==-1){
                continue;
            }
            if(verdict.equals("AC")){
                correct++;
                penalties += ques[prob-1];
                ques[prob-1] = -1;
            }
            else{
                ques[prob-1] += 1;
            }
        }
        System.out.println(correct);
        System.out.println(penalties);
    }
}