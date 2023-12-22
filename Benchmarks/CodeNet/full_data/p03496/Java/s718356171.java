import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n=in.nextInt();
        int arr[]=new int[n+100];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int count=0;
        int ans[]=new int[(int)1e4];
      for(int j=0;j<n-1;j++) {
          int k=0;
          for (int i = 0; i < n - 1; i++) {
              if (arr[i] >= arr[i + 1]) {
                  int a = (arr[i]);
                  int b = (arr[i + 1]);
                  if (a < 0 && b < 0) {
                      count++;
                      arr[i] = arr[i] + arr[i + 1];
                      //System.out.println((i + 2) + " " + (i + 1));
                      ans[k]=i+2;
                      ans[k+1]=i+1;
                      k=k+2;
                      i--;
                      continue;
                  } else if (a > 0 && b < 0) {
                      count++;
                      arr[i + 1] += arr[i];
                      //System.out.println((i + 1) + " " + (i + 2));
                      ans[k]=i+1;
                      ans[k+1]=i+2;
                      k=k+2;
                      i--;
                      continue;
                  }
                  else if(a>0 && b>0){
                      count++;
                      arr[i+1]+=arr[i];
                      //System.out.println((i + 1) + " " + (i + 2));
                      ans[k]=i+1;
                      ans[k+1]=i+2;
                      k=k+2;
                      i--;
                      continue;
                  }
              }

          }
      }
      System.out.println(count);
      for(int i=0;i<ans.length-1;i++){
          if(ans[i]!=0) {
              System.out.println(ans[i] + " " + ans[i + 1]);
              i++;
          }
      }
    }
}


class Fast {
    BufferedReader br;
    StringTokenizer st;

    public Fast() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

