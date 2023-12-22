import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class Main {
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        int [] readarray(int sz){
            int [] ret = new int[sz];
            for(int i = 0; i<sz; i++)ret[i] = nextInt();
            return ret;
        }
    } 
    public static void main(String[] args){
        IO fs = new IO();
        int n = fs.nextInt();
        int [] a = fs.readarray(n);
        Arrays.sort(a);
        int x = n/2;
        int one = a[x];
        int ans1 = 0;
        for(int i = 0; i<n; i++){
            ans1 += (a[i]-one)*(a[i]-one);
        }
        if(x+1<n){
            int two = a[x+1];
            int three = (one+two)/2;
            int ans2 = 0;int ans3 = 0;
            for(int i = 0; i<n; i++){
                ans2 += (a[i]-two)*(a[i]-two);
            }
            for(int i = 0; i<n; i++){
                ans3 += (a[i]-three)*(a[i]-three);
            }
            ans2 = Math.min(ans2,ans3);
            ans1 = Math.min(ans1,ans2);
        }
        if(x-1>=0){
            int four = a[x-1];int five = (one+four)/2;
            int ans4 = 0;int ans5 = 0;
            for(int i = 0; i<n; i++){
                ans4 += (a[i]-four)*(a[i]-four);
            }
            for(int i = 0; i<n; i++){
                ans5 += (a[i]-five)*(a[i]-five);
            }
            ans4 = Math.min(ans4,ans5);
            ans1 = Math.min(ans4,ans1);
        }
        int ans = 0;
        int sum = 0;
        for(int i = 0; i<n; i++)sum+=a[i];
        sum/=n;
        for(int i = 0; i<n; i++){
            ans += (a[i]-sum)*(a[i]-sum);
        }
        System.out.println(Math.min(ans1,ans));
    }
}
