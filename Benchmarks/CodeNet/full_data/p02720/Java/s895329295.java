import java.io.*;
import java.util.*;
 

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Unstoppable solver = new Unstoppable();
	//	int t=in.nextInt();
	//	while(t-->0)
        solver.solve(in, out);
        out.close();
    }
 
    static class Unstoppable {
        
     
        public void solve(InputReader in, PrintWriter out) {
         long k=in.nextLong();
         long ans=0,count=0;
         long i=1;
         while(1==1)
         {
             long temp=i;
             ArrayList<Long> array=new ArrayList<>();
             while(temp!=0){
                 array.add(temp%10);
                 temp/=10;
             }int flag=0;
             for(int j=0;j<array.size()-1;j++)
             {
                if(Math.abs(array.get(j)-array.get(j+1))>1) flag=1;    
             }if(flag==0) count++;
             if(count==k){ ans=i; break; }
         i++;
             
         }
         out.println(ans);
        }
    } 

 
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
 