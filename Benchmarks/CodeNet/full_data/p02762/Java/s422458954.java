import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {

    static void init(int arr[]){
        for(int j=1;j<arr.length;j++){
            arr[j]=j;
        }
    }

    static int root(int a,int arr[]){
        while (arr[a]!=a){
            arr[a]=arr[arr[a]];
            a=arr[a];
        }
        return a;
    }
    static void union(int a,int b,int arr[]){
        int roota=root(a,arr);
        int rootb=root(b,arr);
        if(roota!=rootb){
            arr[roota]=arr[rootb];
        }
    }

    public static void main(String[] args) throws IOException {

        Reader scanner=new Reader();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        int arr[]=new int[n+1];
        LinkedList<Integer>[] friend = new LinkedList[n+1],enemy=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            friend[j]=new LinkedList<>();
            enemy[j]=new LinkedList<>();
        }
        init(arr);
        for(int j=0;j<m;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            friend[a].add(b);
            friend[b].add(a);
            union(a,b,arr);
        }
        for(int j=0;j<k;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            enemy[a].add(b);
            enemy[b].add(a);
        }
//        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int j=1;j<=n;j++){
            int rootj=root(j,arr);
          //  System.out.println(j+" "+arr[j]);
            if(hashMap.get(rootj)==null){
//                stack.push(arr[j]);
                hashMap.put(rootj,1);
//                System.out.println(arr[j]);
            }
            else{
                hashMap.put(rootj,hashMap.get(rootj)+1);
            }
        }
        for(int j=1;j<=n;j++){
            int rootj=root(j,arr);
            int tot=hashMap.get(rootj);
            for(Integer ii:friend[j]){
                int rootii=root(ii,arr);
                if(rootii==rootj){
                    tot--;
                }
            }
            for(Integer ii:enemy[j]){
                int rootii=root(ii,arr);
                if(rootii==rootj){
                    tot--;
                }
            }
            tot--;
            System.out.print(tot+" ");
        }



    }

    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

}
