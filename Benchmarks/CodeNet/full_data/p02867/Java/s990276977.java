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
            if(A_copy.get(i)>B_copy.get(i)){
                opt = false;
                break;
            }
            if(A.get(i)>B.get(i)){
                for(int j=-0;j<A.size();j++){
                    if(A.get(i)<B.get(j)&&A.get(j)>B.get(i)){
                        int replace = A.get(i);
                        A.set(i,A.get(j));
                        A.set(j,replace);
                        num++;
                    }
                }
            }
        }
        if(!opt||num>N-2) System.out.println("No");
        else System.out.println("Yes");
    }
}