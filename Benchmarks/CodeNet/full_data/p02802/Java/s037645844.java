    import java.util.*;
     
    public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int m = s.nextInt();
            int correct = 0;
            int penalty = 0;
            int [] a = new int[n+1];
            for(int i = 0; i<m; i++){
                int problem = s.nextInt();
                String status = s.next();
                if(a[problem] == -1){
                    continue;
                }
                if(status.equals("WA")){
                    a[problem]++;
                }else{
                    correct++;
                    penalty = penalty + a[problem];
                    a[problem] = -1;
                }
            }
            System.out.println(correct);
            System.out.println(penalty);
        }
    }