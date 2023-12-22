import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] b = new int[N];
        int aMax = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            aMax = Math.max(a,aMax);
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int pos = -1;
        for(int i=N-1; i>=0; i--){
            if(aMax>=b[i]){
                pos = i;
                break;
            }
        }
        if(pos!=-1){
            for(int i=N-1;i>=pos+1; i--){
                H = H-b[i];
                if(H<=0){
                    System.out.println(N-i);
                    System.exit(0);
                }
            }
            System.out.println(N-pos-1+(H+1)/aMax);
        }
        else{ // least throw is more powerful than highest wield
            for(int i=N-1;i>=0; i--){
                H = H-b[i];
                if(H<=0){
                    System.out.println(N-i);
                    System.exit(0);
                }
            }
            System.out.println(N+(H+1)/aMax);
        }
    }
}