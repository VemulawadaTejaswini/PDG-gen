import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader();
		int n =in.nextInt();
		int[] arr = new int[n];
		for(int i=1; i<n; i++){
			arr[in.nextInt()-1]++;
		}
		for(int i:arr)
		out(i+"\n");
		
	}
	static void out(String s){
		System.out.print(s);
	}
}



class BufferedReader 
{ 
    java.io.BufferedReader br; 
    StringTokenizer st; 

    public BufferedReader() 
    { 
        br = new java.io.BufferedReader(new
                    InputStreamReader(System.in)); 
    } 

    public String next() 
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

    public int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    public long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    public double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    public String nextLine() 
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