import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int prob = sc.nextInt();
        PriorityQueue<Integer> apple = new PriorityQueue<>();
        for(int i = 0; i<prob;i++){
            apple.add(sc.nextInt());
        }
        PriorityQueue<Integer> set = new PriorityQueue<>();
        int probs = sc.nextInt();
        for(int i=0;i<prob;i++){
            set.add(sc.nextInt());
        }
        int para=0;
        int diff;
        int cand;
        for(int i=0;i<probs;i++){
            diff = set.poll();
            for(int j=0;j<prob;j++){
                cand = apple.poll();
                if(cand<diff){

                }else if(cand==diff){
                    para+=1;
                    break;
                }else{
                    i=probs;
                    break;
                }
            }
        }
        if(para==probs){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
