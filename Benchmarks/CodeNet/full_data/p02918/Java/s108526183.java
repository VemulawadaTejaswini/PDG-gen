import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int r = 1;
        int res = 0;
        for(int i=0; i<n-1; i++) {
            if(s[i] == s[i+1]) {
                res++;
            } else {
                r++;
            }
        }

        while(k > 0) {
            if(r>=3) {
                res+=2;
                r-=2;
                k-=1;
            } else if(r==2) {
                res+=1;
                r-=1;
                k-=1;
            } else {
                break;
            }
        }

        System.out.println(res);
    }

}
