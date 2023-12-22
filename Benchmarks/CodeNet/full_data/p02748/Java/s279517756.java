import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt(), M = in.nextInt(),K=in.nextInt();
        int a[] = new int[N],b[]=new int [M];
        int mina=(int)1e6,minb=(int)1e6;
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
            mina=Math.min(a[i],mina);
        }

        for (int i = 0; i < M; i++) {
            b[i] = in.nextInt();
            minb=Math.min(b[i],minb);
        }

        long ans=(mina+minb);

        for(int i =0;i<K;i++){
            int x=in.nextInt()-1,y=in.nextInt()-1,z=in.nextInt();
            long temp=a[x]+b[y]-z;
            ans=Math.min(temp,ans);
        }

        out.println(ans);
        out.close();
    }


// ternary Search Question
//    public static void main(String[] args) {
//
//        InputReader in = new InputReader();
//        PrintWriter out = new PrintWriter(System.out);
//        int t=in.nextInt();
//        while(t-->0) {
//
//            int N = in.nextInt(),max=-1,diff=0;
//            int arr[] = new int[N];
//            for(int  i=0;i<N;i++){
//                arr[i]=in.nextInt();
//                max=Math.max(max,arr[i]);
//            }
//            if(max==-1){
//                out.println(0+" "+1);
//                continue;
//            }
//
//
//
//            for(int i =1;i<N;i++){
//                int  a =arr[i]==-1?max:arr[i],b =arr[i-1]==-1?max:arr[i-1],d=Math.abs(a-b);
//                diff=Math.max(diff,d);
//            }
//            System.out.println(max+"  diff:-"+diff);
//
//            int l=0,r=max;
//            while(l<=r){
//                int mid=(l+r)/2;
//                int di=0;
//                for(int i =1;i<N;i++){
//                    int  a =arr[i]==-1?mid:arr[i],b =arr[i-1]==-1?mid:arr[i-1],d=Math.abs(a-b);
//                    di=Math.max(di,d);
//                }
//                System.out.println(mid+"  diff:-"+di);
//                if(di<diff){
//                    r=mid-1;
//                    max=mid; diff=di;
//                }else{
//                    l=mid+1;
//                }
//            }
//
//            out.println(diff+" "+max);
//
//        }
//        out.close();
//
//
//    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public int[] shuffle(int[] arr) {
            Random r = new Random();
            for (int i = 1, j; i < arr.length; i++) {
                j = r.nextInt(i);
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
            return arr;
        }

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
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

        public char nextChar() {
            return next().charAt(0);
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }


    }

}


//    public static void main(String[] args) {
//
//        InputReader in = new InputReader();
//        PrintWriter out = new PrintWriter(System.out);
//        int t  =in.nextInt();
//
//        while(t-->0){
//            int  N=in.nextInt();
//            int arr[]=new int[N];
//            for(int i=0 ;i<N;i++)
//                arr[i]=in.nextInt();
//
//            ArrayList<Integer> set1=new ArrayList<>(),set2=new ArrayList<>(),set3=new ArrayList<>();
//            double xval=in.nextInt(),x=in.nextInt(),yval=in.nextInt(),y=in.nextInt();
//            long k=in.nextLong();
//            long  ans  =0;
//
//            if(xval<yval){
//                double temp=xval;
//                xval=yval;
//                yval=temp;
//
//                temp=x;
//                x=y;
//                y=temp;
//            }
//            xval=xval/100; yval=yval/100;
//
//            for(int i =0;i<N;i++){
//                if((i+1)%x==0 && (i+1)%y==0)
//                    set1.add(i);
//                else if ((i+1)%x==0 )
//                    set2.add(i);
//                else if((i+1)%y==0)
//                    set3.add(i);
//            }
//            arr=in.shuffle(arr);
//
//            int a =0,b=0,c=0,add=0;
//
//            for(int  i=N-1;i>=0;i--){
//
//                int temp=0;
//
//                if(a==set1.size()  && b==set2.size()  && c==set3.size())
//                    continue;
//                else if (a==set1.size()  && b==set2.size() ){
//                    ans += (yval) * arr[i];
//                    c++;
//                    temp=11;
//                }else if(a==set1.size()){
//                    if (set2.get(b) <set3.get(c)) {
//                        ans += (xval) * arr[i];
//                        b++;
//                    } else {
//                        ans += (yval) * arr[i];
//                        c++;
//                    }
//                }else{
//                    if (set1.get(a) < set2.get(b) && set1.get(a) < set3.get(c)) {
//                        ans += (xval + yval) * arr[i];
//                        a++;
//                    } else if (set2.get(b)<set3.get(c)) {
//                        ans += (xval) * arr[i];
//                        b++;
//                    } else {
//                        ans += (yval) * arr[i];
//                        c--;
//                    }
//                }
//
//
//
//                if(ans>=k){
//                    break;
//                }
//
//            }
//
//            if(ans<k)
//                out.println(-1);
//            else
//                out.println(add);
//
//
//
//        }
//
//        out.close();
//    }


//
//import java.io.*;
//import java.util.*;
//
//
//public class Q3 {
//
//
//    // tunnel wala Question tourist
//
////    public static void main(String[] args) {
////
////        InputReader in = new InputReader();
////        PrintWriter out = new PrintWriter(System.out);
////
////        int  N=in.nextInt();
////        int arr1[]=new int [N],arr2[]=new int[N];
////        int ans =0;
////
////        for(int i =0;i<N;i++){
////            arr1[i]=in.nextInt();
////        }
////
////        HashMap<Integer,Integer>map=new HashMap<>();
////
////        for(int j=0;j<N;j++){
////            int num=in.nextInt();
////            arr2[j]=num;
////            map.put(num,N-j);
////        }
////        int a[]=new int [N+1];
////
////        boolean flag=false;
////        for(int i =0;i<N;i++) {
////            int num = arr1[i];
////            int val=map.get(num);
////            if(val>(N-i))
////                ans++;
////            else if(val==N-i && !flag){
////                ans++;
////
////            }
////            a[arr1[i]]++;
////            a[arr2[N-i-1]]++;
////
////            if(a[arr1[i]]!=2 || a[arr2[N-i-1]]!=2)
////                flag=false;
////            else
////                flag=true;
////
////        }
////        out.println(ans);
////
////        out.close();
////
////
////    }
//
//    static class InputReader {
//        public BufferedReader reader;
//        public StringTokenizer tokenizer;
//
//
//        public int[] shuffle(int[] arr) {
//            Random r = new Random();
//            for (int i = 1, j; i < arr.length; i++) {
//                j = r.nextInt(i);
//                arr[i] = arr[i] ^ arr[j];
//                arr[j] = arr[i] ^ arr[j];
//                arr[i] = arr[i] ^ arr[j];
//            }
//            return arr;
//        }
//
//        public InputReader() {
//            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
//            tokenizer = null;
//        }
//
//        public InputReader(InputStream stream) {
//            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
//            tokenizer = null;
//        }
//
//        public String next() {
//            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//                try {
//                    tokenizer = new StringTokenizer(reader.readLine());
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            return tokenizer.nextToken();
//        }
//
//        public char nextChar() {
//            return next().charAt(0);
//        }
//
//        public int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        public long nextLong() {
//            return Long.parseLong(next());
//        }
//
//        public double nextDouble() {
//            return Double.parseDouble(next());
//        }
//
//
//    }
//
//}