import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();   

        int A, B, C, D, E, F;
        {int[] a = r.ii(); A = a[0]; B = a[1]; C = a[2]; D = a[3]; E = a[4]; F = a[5];}

        ArrayList<Integer> water = new ArrayList<>(930);
        for(int i = 1, k = 0, temp; i <= 30; i++)
            for(int j = 0; j <= 30; j++)
                if((temp=100*(A*i+B*j)) <= F)
                    water.add(temp);
                else
                    break;    

        double maxC = 0;
        int maxW = 100*A;
        int maxS = 0;

        for(int w : water){
            int size = F+1-w;
            if(size <= 0)
                break;

            int[] sugar = new int[size]; 
            for(int i = C; i < Math.min(size, D); i++){
                sugar[i] = C;
                if(i == C && maxC < (double)C/w && C*100 <= w*E){
                    maxC = (double)C/w;
                    maxW = w;
                    maxS = C;
                }
            } 

            for(int i = D; i < size; i++){
                int s = sugar[i] = max(sugar[i-C]+C, sugar[i-D]+D, sugar[i-1]);
                double c = (double)s/w;
                
                if(s*100 > w*E)
                    break;
                    
                if(maxC < c){
                    maxC = c;
                    maxW = w;
                    maxS = s;
                }                    
            }
        }
        println(maxW+maxS+" "+maxS);
    }

    static void print(Object o){
        System.out.print(o.toString());
    }

    static void println(Object o){
        System.out.println(o.toString());
    }

    static int Int(String s){
        return Integer.parseInt(s);
    }

    static long Long(String s){
        return Long.parseLong(s);
    }

    static int max(int... ii){
        int max = ii[0];
        for(int i : ii) if(max < i) max = i;
        return max;
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}