import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int N;
        //HashMap<Integer,Integer> list = new HashMap()<Integer,Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> gcd = new ArrayList<Integer>();
        ArrayList<Integer> next = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for(int i=0;i<N;i++){
            a.add(sc.nextInt());
        }
        if(N%2!=0)
            a.add(a.get(N-1));
            
        
        int ans = 0;
        
        ///////////////////
        for(int i=1;i<a.size();i+=2){
            next.add(gcd(a.get(i-1),a.get(i)));
        }
        // System.out.append(Arrays.toString(next.toArray()));

        while(next.size()>1){
            for(int i=1;i<next.size();i+=2){
                gcd.add(gcd(next.get(i-1),next.get(i)));
            }
            next = new ArrayList<Integer>(gcd);
            // System.out.append(Arrays.toString(next.toArray()));
            gcd.clear();
        }
        ans = Math.max(ans,next.get(0));
        next.clear();

        ///////////////////
        for(int i=1;i<a.size();i+=2){
            int in = gcd(a.get(i-1),a.get(i));
            if(in==ans)in=Math.max(a.get(i-1),a.get(i));
            next.add(in);
        }
        // System.out.append(Arrays.toString(next.toArray()));


        while(next.size()>1){
            for(int i=1;i<next.size();i+=2){
                gcd.add(gcd(next.get(i-1),next.get(i)));
            }
            next = new ArrayList<Integer>(gcd);
            // System.out.append(Arrays.toString(next.toArray()));
            gcd.clear();
        }
        ans = Math.max(ans,next.get(0));
        next.clear();

        //////////////////////
        for(int i=1;i<a.size();i+=2){
            int in = gcd(a.get(i-1),a.get(i));
            if(in==ans)in=Math.min(a.get(i-1),a.get(i));
            next.add(in);
        }
        // System.out.append(Arrays.toString(next.toArray()));


        while(next.size()>1){
            for(int i=1;i<next.size();i+=2){
                gcd.add(gcd(next.get(i-1),next.get(i)));
            }
            next = new ArrayList<Integer>(gcd);
            // System.out.append(Arrays.toString(next.toArray()));
            gcd.clear();
        }
        ans = Math.max(ans,next.get(0));
        next.clear();

        System.out.println(ans);
    }

    static int gcd(int m, int n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}