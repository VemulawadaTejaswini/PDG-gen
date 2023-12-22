import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i < N + 1;i++){
            A.add(Integer.parseInt(sc.next()));
        }
        for(int i = 0; i < N ;i++){
            B.add(Integer.parseInt(sc.next()));
        }
        for(int i = 0; i < N ;i++){
            if(A.get(i) >= B.get(i)){
                count += B.get(i);
                A.set(i,0);
            }else{
                count += A.get(i);
                B.set(i,B.get(i) - A.get(i));
                if(A.get(i+1) >= B.get(i)){
                    count += B.get(i);
                    A.set(i+1,A.get(i+1)-B.get(i));
                }else{
                    count += A.get(i+1);
                    A.set(i+1,0);
                }
            }
        }
       System.out.println(count);
    }
}