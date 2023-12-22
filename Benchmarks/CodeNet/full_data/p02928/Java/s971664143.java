import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int answer=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(sc.next());
            list.add(A);
        }/*
        for(int k = 0; k < K; k++){
        for(int i = 0; i < N; i++){
            list.add(A[i]);
        }
        }
        */
        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
            if(list.get(i) < list.get(j)){
            answer++;
            }
            }
        }
        List<Integer> list2 = new ArrayList<Integer>(new HashSet<>(list));
        Collections.sort(list2, Collections.reverseOrder());
        int count=0;
        for(int i = 1; i < list2.size(); i++){
            count+=i;
        }
        int s = count*(K-1);
        answer = answer * K;
        if(list2.size() == 1){
            System.out.println("0");  

        }
        else{
        System.out.println((answer+s)%1000000007);  
        }
            
        }
    }
    

