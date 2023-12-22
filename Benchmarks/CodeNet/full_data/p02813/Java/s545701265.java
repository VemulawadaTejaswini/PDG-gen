/*package whatever //do not write package name here */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.Arrays; 
  
public class Main 

{
    static int count=0;
    static String arr[];
    public Main(int n ){
        arr = new String[fact(n)];
    }
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
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
    }
    StringBuilder swap(int i1,int i2,StringBuilder s){
        char temp1=s.charAt(i1),temp2=s.charAt(i2);
        s.setCharAt(i1,temp2);
        s.setCharAt(i2,temp1);
        return s;
    }
    void permute(StringBuilder s, int l, int r,String arr[]){
        if(l==r){
            Main.arr[Main.count]=s.toString();
            Main.count++;
            //System.out.println(s);
        }
        else{
            for (int i=l;i<=r ;i++ ) {
                
                s=this.swap(i,l,s);
                permute(s,l+1,r,arr);
                s=this.swap(l,i,s);
                
            }
        }
    }
    static int fact(int a){
        if(a==1 || a==0){
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main (String[] args) {
        FastReader ob = new FastReader();
        
        int n = ob.nextInt();
        String a="",b="";
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i=0;i<n ;i++ ) {
            arr1[i] = ob.nextInt();
            a+=arr1[i];
        }
        for (int i=0;i<n ;i++ ) {
            arr2[i]=ob.nextInt();
            b+=arr2[i];
        }
        String num="";
        for (int i=1;i<=n ;i++ ) {
            num+=i;
        }
        StringBuilder s1 =new StringBuilder(num);
        Main   ob1 =new Main(n);
        ob1.permute(s1,0,n-1,arr);
        int k =fact(n);
        Arrays.sort(arr);
        int index1=0,index2=0;
        for (int i=0;i<k ;i++ ) {
           if(arr[i].compareTo(a)==0){
               index1=i+1;
           }
           if(arr[i].compareTo(b)==0){
               index2=i+1;
           }
        }
        //System.out.println(a+" "+b);
        System.out.println(Math.max(index2,index1)-Math.min(index1,index2));
    }
}