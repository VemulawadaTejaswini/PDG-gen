import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        int cR = 0;
        int cG = 0;
        int cB = 0;
        

        for(int i = 0; i < n; i++){
            if(c[i] == 'R'){
                cR++;
            }
            else if(c[i] == 'G'){
                cG++;
            }
            else{
                cB++;
            }
        }

        // System.out.println(cR + " " + cG + " " + cB);

        long cnt = cR*cG*cB;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < (n+i+1)/2 ; j++){
                int k = 2*j-i;
                if(c[i] != c[j] && c[j] != c[k] && c[i] != c[k])cnt--;
            }
        }

        if(cnt >= 0)System.out.println(cnt);
        else System.out.println(0);
        sc.close();
    }
}

