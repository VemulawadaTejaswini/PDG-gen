import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] l = new int[Q+1];
        int[] r = new int[Q+1];
        int rmax = Integer.MIN_VALUE;
        for(int i=1;i<=Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            rmax = Math.max(rmax,r[i]);
        }
        boolean[] primeRecord = new boolean[rmax+2];
        primeRecord[2]=true;
        for(int i=3;i<=rmax+1; i++){
            if((i&1)==0||(!isPrime(i)))continue;
            primeRecord[i] = true;
        }
        int[] rec2017 = new int[rmax+2];
        for(int i=3;i<=rmax+1; i++){
            if((i&1)==1&&primeRecord[i]&&primeRecord[(i+1)/2]){
                rec2017[i] =rec2017[i-1]+1;
            }
            else rec2017[i] = rec2017[i-1];
        }
        for(int i=1; i<=Q; i++){
            int ans;
            int left = l[i];
            int right = r[i];
            if((left&1)==0) left++;
            if((right&1)==0) right--;
            if(right<left) ans = 0;
            else{
                ans = rec2017[right]-rec2017[left-1];
            }
            System.out.println(ans);
        }
    }
    private static boolean isPrime(int target){
        int upper = (int) Math.sqrt(target)+1;
        for(int i=2; i<= upper; i++){
            if(target%i==0) return false;
        }
        return true;
    }
}