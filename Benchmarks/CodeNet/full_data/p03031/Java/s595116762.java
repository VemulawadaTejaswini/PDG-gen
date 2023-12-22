import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();        
        int m = stdIn.nextInt();
        int[] k = new int[m];
        for(int i =  0; i < m; i++){
            int s = stdIn.nextInt();
            k[i] = 0;
            for(int j = 0; j < s; j++){
                k[i] = k[i] | (int)Math.pow(2, stdIn.nextInt()-1);    //繋がるスイッチに１を立てる
            }

        }

        int[] p = new int[m];
        Arrays.setAll(p, i -> stdIn.nextInt());
        boolean b = true;
        int answer = 0;
        for(int i = 0 ; i <= (int)Math.pow(2, n); i++){
            for(int j = 0; j < m; j++){
                if(Integer.bitCount(k[j] & i) % 2 != p[j]){
                    b = false;
                    break;
                }
            }
            if(b) answer++;
            b = true;
        }
        System.out.println(answer);
   }
}