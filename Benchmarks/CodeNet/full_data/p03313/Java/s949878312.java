import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class Main{

    static class RMQ{
        long data[][];
        int N;
        
        RMQ(int n){
            N=1;
            while(N<n)N*=2;
            data = new long[N*2][2];
        }

        void set(int x, long d){
            x += N;
            data[x][0]=d;
            data[x][1]=0;
            long[] tmp = new long[4];
            for(x/=2;x>0;x/=2){
                tmp[0]=data[x*2][0];
                tmp[1]=data[x*2][1];
                tmp[2]=data[x*2+1][0];
                tmp[3]=data[x*2+1][1];
                Arrays.sort(tmp);
                data[x][0]=tmp[3];
                data[x][1]=tmp[2];
            }
        }

        long[] get(int l, int r, int k, int a, int b){
            if(l<=a&&b<=r)return data[k];
            if(r<=a||b<=l)return new long[2];

            long[] tmp = new long[4];
            long[] d1 = get(l, r, 2*k, a, (a+b)/2);
            long[] d2 = get(l, r, 2*k+1, (a+b)/2, b);
            tmp[0]=d1[0];
            tmp[1]=d1[1];
            tmp[2]=d2[0];
            tmp[3]=d2[1];
            Arrays.sort(tmp);
            d1[0]=tmp[3];d1[1]=tmp[2];
            return d1;
        }

        long get(int l, int r){
            long[] res = get(l, r, 1, 0, N);
            return res[0]+res[1];
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        RMQ rmq = new RMQ((1<<N));
        long[] a = new long[(1<<N)];
        for(int i=0;i<(1<<N);++i)a[i]=scan.nextLong();
        for(int i=0;i<(1<<N);++i)rmq.set(i, a[i]);
        PrintWriter out = new PrintWriter(System.out);
        for(int K=1;K<(1<<N);++K){
            long res = 0;
            int base = 0;
            for(int j=N;j>=0;--j){
                if(((K>>j)&1)==1){
                    res = Math.max(res, rmq.get(base, base+(1<<j)));
                    base += (1<<j);
                }
            }
            long max1=-1;
            long max2=-1;
            for(int j=K;j>=0;--j){
                j&=K;
                if(a[j]>max1){
                    max2=max1;
                    max1=a[j];
                }else if(a[j]>max2){
                    max2=a[j];
                }
            }
            out.println(Math.max(res, max1+max2));
        }
        out.flush();out.close();
    }
}