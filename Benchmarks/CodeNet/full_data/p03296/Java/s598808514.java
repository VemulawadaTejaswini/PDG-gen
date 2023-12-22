
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lotfi
 */
 class Main {
    public static void main(String[] args) throws IOException {
        IO sc = new IO (System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(count(arr));
   }
    static int count(int[] arr){
        int i=0;
        int count=0;
        while(i<arr.length-1){
        if(arr[i]==arr[i+1]){
               count++;
            i+=2;
           
        }
        else{
            i++;
        }}
        return count;
    }
    public static class IO {
  private BufferedReader br;
  private StringTokenizer st;
  public IO(InputStream inputStream){
    br = new BufferedReader(new InputStreamReader(inputStream));
  }
  public String nextLine() throws IOException{
      return br.readLine();
  }
  public String next() {
    while (st == null || !st.hasMoreTokens()){
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException ignored){}
    }
    return st.nextToken();
  }
  public int nextInt() {
    return Integer.parseInt(next());
  }
  public long nextLong() {
    return Long.parseLong(next());
  }
 
}
}
