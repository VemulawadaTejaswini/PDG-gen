import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long opt = 0;
        ArrayList<Integer> A = new ArrayList<>();
        Map<Integer,Integer> B = new HashMap<>();
        for(int a=0;a<N;a++){
            int A_num = sc.nextInt();
            int B_num = sc.nextInt();
            A.add(A_num);
            B.put(A_num,B_num);
        }
        Collections.sort(A);
        for(int a=0;a<A.size();a++){
            long m = B.get(A.get(a));
            if(M-m>0){
                M-=m;
                opt+=(long)A.get(a)*m;
            }
            else if(M-m<=0){
                M-=m;
                opt+=(long)A.get(a)*M;
                break;
            }
        }
        System.out.println(opt);
    }
}
