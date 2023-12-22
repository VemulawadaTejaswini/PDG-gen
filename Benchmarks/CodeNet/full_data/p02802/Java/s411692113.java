import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int currentProbNum=0;
        int oldProb= 0;
        int penalty=0;
        int flag=0;
        int correct=0;
        String submission= null;
        for(int i=1; i<=M; i++){
            currentProbNum= sc.nextInt();
            submission = sc.next();
            if(oldProb==0){
                oldProb = currentProbNum;
            }
            else if(oldProb==currentProbNum){
                if(flag==1){

                }
                else {
                    if (submission.equals("WA")) {
                        penalty++;
                    }
                    if(submission.equals("AC")){
                        flag=1;
                        correct++;
                    }
                }
            }
            else if(oldProb!=currentProbNum){
                flag=0;
                if(submission.equals("AC")){
                    flag=1;
                    correct++;
                }
                if(submission.equals("WA")){
                    penalty++;
                }
            }

        }
        System.out.println(correct);
        System.out.println(penalty);
    }
}
