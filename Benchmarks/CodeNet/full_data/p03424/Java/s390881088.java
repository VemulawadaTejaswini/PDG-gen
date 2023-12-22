import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String[] S=new String[N];
        int s[]=new int[4];
        int ans=0;
        for(int i=0;i<N;i++){
            S[i]=sc.next();
        }
        for(int i=0;i<N;i++){
            if(S[i].charAt(0)=='P')s[0]++;
            if(S[i].charAt(0)=='W')s[1]++;
            if(S[i].charAt(0)=='G')s[2]++;
            if(S[i].charAt(0)=='Y')s[3]++;
        }
        for(int i=0;i<4;i++){
            if(s[i]>0){
                ans++;
            }
        }
        if(ans==3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
     }
    }
    }
