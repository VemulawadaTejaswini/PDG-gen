import java.util.*;
import java.io.*;

public class Main{
    static int[] dp, a;
    static int amin=10;
    static final int num[]={0,2,5,5,4,5,6,3,7,6};
    static ArrayList<Integer> ans=new ArrayList<>();

    static int dp(int i){
        int max=0;
        if(i<amin) return Integer.MIN_VALUE;
        if(dp[i]>0) return dp[i];
        for(int k:a) if(dp(i-num[k])+1>max) max=dp(i-num[k])+1;
        dp[i]=max;
        return dp[i];
    }
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        final int n=fsc.nextInt(), m=fsc.nextInt();
        a=new int[m];
        dp=new int[n+1];
        for(int i=0;i<m;i++){
            a[i]=fsc.nextInt();
            dp[num[a[i]]]=1;
            amin=Math.min(amin, a[i]);
        }
        fsc.close();
        if(dp[2]>0){
            dp[4]=2; dp[6]=3;
            if(dp[3]>0){
                dp[5]=2; dp[7]=3;
            }
            else if(dp[5]>0) dp[7]=2;
        }
        else if(dp[3]>0){
            dp[6]=2;
            if(dp[4]>0) dp[7]=2;
        }
        int d=dp(n);
        //for(int i=0;i<=n;i++) System.out.println("dp["+i+"]:"+dp[i]);
        int now=n;
        Arrays.sort(a);
        for(int i=d;i>=1;i--){
            for(int j=a.length-1;j>=0;j--){
                if(now-num[a[j]]<0) continue;
                if(i==1){
                    if(now-num[a[j]]==0){
                        ans.add(a[j]);
                        now=now-num[a[j]];
                        break;
                    }
                }
                else{
                    if(dp[now-num[a[j]]]==i-1){
                        ans.add(a[j]);
                        now=now-num[a[j]];
                        break;
                    }
                }
            }
        }
        //Collections.sort(ans,(x,y)->{return y-x;});
        StringBuilder sb=new StringBuilder("");
        for(int k:ans) sb.append(k);
        System.out.println(sb);

        //
        // int[] a=new int[m];
        // int[] max=new int[8];
        // for(int i=0;i<m;i++){
        //     a[i]=fsc.nextInt();
        //     max[num[a[i]]]=Math.max(a[i],max[num[a[i]]]);
        // }
        // fsc.close();
        // if(max[2]>0){
        //     max[4]=0; max[6]=0;
        //     if(max[3]>0){
        //         max[5]=0; max[7]=0;
        //     }
        //     if(max[5]>0) max[7]=0;
        // }
        // if(max[3]>0){
        //     max[6]=0;
        //     if(max[4]>0) max[7]=0;
        // }
        // StringBuilder ans=new StringBuilder("");
        // if(max[2]>0){
        //     if(n%2==0) for(int i=0;i<n/2;i++) ans.append(max[2]);
        //     else if(max[3]>0){
        //         for(int i=0;i<n%2;i++) ans.append(max[3]);
        //         for(int i=0;i<(n-3*(n%2))/2;i++) ans.append(max[2]);
        //     }
        //     else if(max[5]>0){
        //         for(int i=0;i<n%2;i++) ans.append(max[5]);
        //         for(int i=0;i<(n-5*(n%2))/2;i++) ans.append(max[2]);
        //     }
        //     else if(max[7]>0){
        //         for(int i=0;i<n%2;i++) ans.append(max[7]);
        //         for(int i=0;i<(n-7*(n%2))/2;i++) ans.append(max[2]);
        //     }
        // }
        // else if(max[3]>0){
        //     if(n%3==0) for(int i=0;i<n/3;i++) ans.append(max[3]);
        //     else if(max[4]>0){
        //         if(max[5]>0){
        //             if(n%3==1){
        //                 for(int i=0;i<(n-4)/3;i++) ans.append(max[3]);
        //                 ans.append(max[4]);
        //             }
        //             else if(n%3==2){
        //                 for(int i=0;i<(n-5)/3;i++) ans.append(max[3]);
        //                 ans.append(max[5]);
        //             }
        //         }
        //         else{
        //             for(int i=0;i<(n-4*(n%3))/3;i++) ans.append(max[3]);
        //             for(int i=0;i<n%3;i++) ans.append(max[4]);
        //         }
        //     }
        //     else if(max[5]>0){
        //         if(max[7]>0){
        //             if(n%3==1){
        //                 ans.append(max[7]);
        //                 for(int i=0;i<(n-7)/3;i++) ans.append(max[3]);
        //             }
        //             else if(n%3==2){
        //                 for(int i=0;i<(n-5)/3;i++) ans.append(max[3]);
        //                 ans.append(max[5]);
        //             }
        //         }
        //         else{
        //             int[] tmp={0,2,1};
        //             for(int i=0;i<(n-5*tmp[n%3])/3;i++) ans.append(max[3]);
        //             for(int i=0;i<tmp[n%3];i++) ans.append(max[5]);
        //         }
        //     }
        //     else if(max[7]>0){
        //         for(int i=0;i<n%3;i++) ans.append(max[7]);
        //         for(int i=0;i<(n-7*(n%3))/3;i++) ans.append(max[3]);
        //     }
        // }
        // else if(max[4]>0){
        //     if(n%4==0) for(int i=0;i<n/4;i++) ans.append(max[4]);
        //     else if(max[5]>0){
        //         if(max[6]>0){
        //             if(max[7]>0){
        //                 if(n%4==1){
        //                     if(max[5]>max[4]){
        //                         ans.append(max[5]);
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                     }
        //                     else{
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                         ans.append(max[5]);
        //                     }
        //                 }
        //                 else if(n%4==2){
        //                     ans.append(max[6]);
        //                     for(int i=0;i<(n-6)/4;i++) ans.append(max[4]);
        //                 }
        //                 else if(n%4==3){
        //                     if(max[6]>max[7]){
        //                         ans.append(max[6]);
        //                         if(max[5]>max[4]){
        //                             ans.append(max[5]);
        //                             for(int i=0;i<(n-11)/4;i++) ans.append(max[4]);
        //                         }
        //                         else{
        //                             for(int i=0;i<(n-11)/4;i++) ans.append(max[4]);
        //                             ans.append(max[5]);
        //                         }
        //                     }
        //                     else{
        //                         ans.append(max[7]);
        //                         for(int i=0;i<(n-7)/4;i++) ans.append(max[4]);
        //                     }
        //                 }
        //             }
        //             else{
        //                 if(n%4==1){
        //                     if(max[5]>max[4]){
        //                         ans.append(max[5]);
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                     }
        //                     else{
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                         ans.append(max[5]);
        //                     }
        //                 }
        //                 else if(n%4==2){
        //                     ans.append(max[6]);
        //                     for(int i=0;i<(n-6)/4;i++) ans.append(max[4]);
        //                 }
        //                 else if(n%4==3){
        //                     ans.append(max[6]); 
        //                     if(max[5]>max[4]){
        //                         ans.append(max[5]);
        //                         for(int i=0;i<(n-11)/4;i++) ans.append(max[4]);
        //                     }
        //                     else{
        //                         for(int i=0;i<(n-11)/4;i++) ans.append(max[4]);
        //                         ans.append(max[5]);
        //                     }
        //                 }
        //             }
        //         }
        //         else{
        //             if(max[7]>0){
        //                 if(n%4==1){
        //                     if(max[5]>max[4]){
        //                         ans.append(max[5]);
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                     }
        //                     else{
        //                         for(int i=0;i<(n-5)/4;i++) ans.append(max[4]);
        //                         ans.append(max[5]);
        //                     }
        //                 }
        //                 else if(n%4==2){
        //                     if(max[5]>max[4]){
        //                         ans.append(max[5]); ans.append(max[5]);
        //                         for(int i=0;i<(n-10)/4;i++) ans.append(max[4]);
        //                     }
        //                     else{
        //                         for(int i=0;i<(n-10)/4;i++) ans.append(max[4]);
        //                         ans.append(max[5]); ans.append(max[5]);
        //                     }
        //                 }
        //                 else if(n%4==3){
        //                     ans.append(max[7]);
        //                     for(int i=0;i<(n-7)/4;i++) ans.append(max[4]);
        //                 }
        //             }
        //             else{
        //                 if(max[5]>max[4]){
        //                     for(int i=0;i<n%4;i++) ans.append(max[5]);
        //                     for(int i=0;i<(n-5*(n%4))/4;i++) ans.append(max[4]);
        //                 }
        //                 else{
        //                     for(int i=0;i<(n-5*(n%4))/4;i++) ans.append(max[4]);
        //                     for(int i=0;i<n%4;i++) ans.append(max[5]);
        //                 }
        //             }
        //         }
        //     }
        //     else{
        //         if(max[6]>0){
        //             if(max[7]>0){
        //                 if(n%4==1){
        //                     if(max[6]>max[7]){
        //                         ans.append(max[6]); ans.append(max[7]);
        //                     }
        //                     else{
        //                         ans.append(max[7]); ans.append(max[6]);
        //                     }
        //                     for(int i=0;i<(n-13)/4;i++) ans.append(max[4]);
        //                 }
        //                 else if(n%4==2){
        //                     ans.append(max[6]);
        //                     for(int i=0;i<(n-6)/4;i++) ans.append(max[4]);
        //                 }
        //                 else{
        //                     ans.append(max[7]);
        //                     for(int i=0;i<(n-7)/4;i++) ans.append(max[4]);
        //                 }
        //             }
        //             else{
        //                 if(n%4==2){
        //                     ans.append(max[6]);
        //                     for(int i=0;i<(n-6)/4;i++) ans.append(max[4]);
        //                 }
        //             }
        //         }
        //         else{
        //             if(max[7]>0){
        //                 int[] tmp={0,3,2,1};
        //                 for(int i=0;i<tmp[n%4];i++) ans.append(max[7]);
        //                 for(int i=0;i<(n-7*tmp[n%4])/4;i++) ans.append(max[4]);
        //             }
        //         }
        //     }
        // }
        // else if(max[5]>0){
        //     if(n%5==0) for(int i=0;i<n/5;i++) ans.append(max[5]);
        //     else if(max[6]>0 && max[7]>0){
        //         if(n%5==1){
        //             ans.append(max[6]);
        //             for(int i=0;i<(n-6)/5;i++) ans.append(max[5]);
        //         }
        //         else if(n%5==2){
        //             ans.append(max[7]);
        //             for(int i=0;i<(n-7)/5;i++) ans.append(max[5]);
        //         }
        //         else if(n%5==3){
        //             if(max[6]>max[7]){
        //                 ans.append(max[6]); ans.append(max[7]);
        //             }
        //             else{
        //                 ans.append(max[7]); ans.append(max[6]);
        //             }
        //             for(int i=0;i<(n-13)/5;i++) ans.append(max[5]);
        //         }
        //         else if(n%5==4){
        //             if(max[6]>max[7]){
        //                 for(int i=0;i<n%5;i++) ans.append(max[6]);
        //                 for(int i=0;i<(n-6*(n%5))/5;i++) ans.append(max[5]);
        //             }
        //             else{
        //                 ans.append(max[7]); ans.append(max[7]);
        //                 for(int i=0;i<(n-14)/5;i++) ans.append(max[5]);
        //             }
        //         }
        //     }
        //     else if(max[6]>0){
        //         for(int i=0;i<n%5;i++) ans.append(max[6]);
        //         for(int i=0;i<(n-6*(n%5))/5;i++) ans.append(max[5]);
        //     }
        //     else if(max[7]>0){
        //         int[] tmp={0,3,1,4,2};
        //         for(int i=0;i<tmp[n%5];i++) ans.append(max[7]);
        //         for(int i=0;i<(n-7*(tmp[n%5]))/5;i++) ans.append(max[5]);
        //     }
        //     else for(int i=0;i<n/5;i++) ans.append(max[5]);
        // }
        // else if(max[6]>0){
        //     if(max[7]>0){
        //         if(max[6]>max[7]){
        //             for(int i=0;i<(n-7*(n%6))/6;i++) ans.append(max[6]);
        //             for(int i=0;i<n%6;i++) ans.append(max[7]);
        //         }
        //         else{
        //             for(int i=0;i<n%6;i++) ans.append(max[7]);
        //             for(int i=0;i<(n-7*(n%6))/6;i++) ans.append(max[6]);
        //         }
        //     }
        //     else for(int i=0;i<n/6;i++) ans.append(max[6]);
        // }
        // else for(int i=0;i<n/7;i++) ans.append(max[7]);
        // System.out.println(ans);
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}