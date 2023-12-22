import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.CookieHandler;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Long> positive, negative, minus_nega;
    long zeros = 0, k = 0, n = 0;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        n = sc.nextInt();
        k = sc.nextInt();
        k = n*(n-1)/2+1-k; // then find the k-th largest
        positive = new ArrayList<>(); negative = new ArrayList<>(); minus_nega = new ArrayList<>();
        long maxi = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long a = sc.nextLong();
            maxi = Math.max(maxi,a*a);
            if(a>0) positive.add(a);
            else if(a==0) zeros += 1;
            else{
                negative.add(a);
                minus_nega.add(-a);
            }
        }
        Collections.sort(positive);
        Collections.sort(negative);
        Collections.sort(minus_nega);
        ArrayList<Long> temp = new ArrayList<>();
        Collections.sort(temp);
        long lo = Long.MIN_VALUE/2, hi = Long.MAX_VALUE/2;
        while(hi-lo>1){
            long mid = (hi+lo)/2;
            if(legal(mid)) lo = mid;
            else hi = mid;
        }
        System.out.println(lo);

    }
    boolean legal(long guess){
        long ans = 0;
        if(guess>0){
            ans += helperPosList(positive,guess);
            ans += helperPosList(minus_nega,guess);
            if(ans>=k) return true;
        }
        if(guess<=0){
            ans += zeros*(n-zeros);
            ans += zeros*(zeros-1)/2;
            ans += positive.size()*(positive.size()-1)/2;
            ans += negative.size()*(negative.size()-1)/2;
            if(ans>=k) return true;
        }
        if(guess < 0){
            int lenPos = positive.size(), lenNeg = negative.size();
            if(lenNeg*lenPos>0){
                int right = 0;
                for(int i=0;i<lenPos;i++){
                    long cur = positive.get(i);
                    while(right<lenNeg&&cur*negative.get(right)<guess) right++;
                    ans += lenNeg-right;
                }
            }
        }
        return ans >= k;
    }
    long helperPosList(ArrayList<Long> pos, long lower){
        // finds how many elements in the list with products are >= lower
        // orders don't matter
        // pos is all positive
        int len = pos.size(), left=0;
        long ans = 0;
        if(len==0||pos.get(len-1)*pos.get(len-1)<lower) return 0;
        for(int right=len-1;right>=0;right--){
            long cur = pos.get(right);
            while(left<len&&pos.get(left)*cur<lower) left++;
            if(left!=len){
                if(left<=right) ans += len-left-1;
                else ans += len-left;
            }
        }
        ans /= 2; // order, repetitive
        return ans;
    }
}

