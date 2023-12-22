import java.io.*;
import java.util.*;
public class Main{
    static int cSize = 51;
    static long[][] C = new long[cSize][cSize];    
    static {
        for(int i = 0; i < cSize; i++)
            C[i][0] = C[i][i] = 1;        
    }
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N, A, B;
        {int[] a = r.ii(); N = a[0]; A = a[1]; B = a[2];}
        long[] v = r.ll();
        
        HashMap<Long, Integer> map = new HashMap<>();
        long[][] array = new long[50][2];
        int end = 0;
        for(long w : v){
            if(map.containsKey(w))
                array[map.get(w)][1]++;
            else{
                map.put(w, end);
                array[end++] = new long[]{w, 1};
            }
        }
        Arrays.parallelSort(array, 0, end, (x, y) -> {
                long z = -x[0]+y[0];
                return z > 0 ? 1 : z < 0 ? -1 : 0;});
        long mSum = 0;
        long mNum = A;
        long caseNum = 0;
        for(int i = A; i < B+1; i++){
            long sum = 0;
            long count = 0;
            for(int j = 0, k = 0; j < i; k++){
                int num = (int)array[k][1];
                if(j+num < i){
                    j += num;
                    sum += num*array[k][0];
                } else{
                    sum += (i-j)*array[k][0];
                    count = c(num, i-j);
                    break;
                }
            }
            if(i*mSum < mNum*sum){
                caseNum = count;
                mSum = sum;
                mNum = i;                
            } else if(i*mSum == mNum*sum){
                caseNum += count;
            }
        }
        println((double)mSum/mNum);
        println(caseNum);
    }

    static long c(int n, int r){
        if(C[n][r] > 0)
            return C[n][r];
        else{
            return C[n][r] = c(n-1, r-1)+c(n-1, r);
        }
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
    static class MyReader extends BufferedReader{
        MyReader(){
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
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}