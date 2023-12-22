import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> A_copy = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> B_copy = new ArrayList<>();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            A.add(num);
            A_copy.add(num);
        }
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            B.add(num);
            B_copy.add(num);
        }
        Collections.sort(A_copy);
        Collections.sort(B_copy);
        boolean opt = true;
        int num = 0;
        for(int i=0;i<N;i++){
            if(A.get(i)>B.get(i)) num++;
            if(A_copy.get(i)>B_copy.get(i)){
                opt = false;
                break;
            }
        }
        if(num>N-2) opt = false;
        if(!opt) System.out.println("No");
        else System.out.println("Yes");

    }
}