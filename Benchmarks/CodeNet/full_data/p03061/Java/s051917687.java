import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        List<Integer> c = new ArrayList<>();
        int memo = 0;
        int ans = 0; 

        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        for(int i = 0;i < N;i++){
            for(int j = 1;j <= A[N-1];j++){
                if(A[i] % j == 0 && A[i] >= j){
                    c.add(j);
                }else if(A[i] < j){
                    break;
                }
            }
        }
        Collections.sort(c,Collections.reverseOrder());
        for(int i = 0;i < c.size();i++){
            memo = c.get(i);
            if(memo == c.get(i+1)){
                
                ans += 2;
                if(ans == N){
                    break;
                }else if((c.get(i+1) != c.get(i+2)) && ans == N-1){
                    break;
                }else{
                    ans = 0;
                }
        }

        
    }
    System.out.println(memo);
    }
}