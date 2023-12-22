import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score_Alice=0;
        int score_Bob = 0;
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<Integer>();
        for(int a=0;a<N;a++){
            List.add(sc.nextInt());
        }
        Collection<Integer> num_List = new ArrayList<Integer>(List);

        for(int a=0;a<N;a++){
            int score = Collections.max(num_List);
           if(a%2==0){
               score_Alice +=score;
           }
           else{
               score_Bob +=score;
           }
           num_List.remove(score);
        }
        int score = score_Alice - score_Bob;
        System.out.println(score);
    }
}