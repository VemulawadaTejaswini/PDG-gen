
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner=new Scanner(System.in);
//        Reader reader=new Reader();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String str=scanner.readLine();
        int q=Integer.parseInt(scanner.readLine());
    //    StringBuffer stringBuilder=new StringBuffer(str);
        PrintWriter printWriter=new PrintWriter(System.out);
        int c=0;
        for(int j=0;j<q;j++){
            String[] ssa=scanner.readLine().trim().split(" ");
            int t=Integer.parseInt(ssa[0]);
//            int t=scanner.nextInt();
            if(t==1){
//                stringBuilder=stringBuilder.reverse();
                c++;
                c=c%2;
            }
            else{
                int f=Integer.parseInt(ssa[1]);
//                int f=scanner.nextInt();
                if(f==1){
//                    String ssa=scanner.next();
                    if(c%2!=0){
//                        stringBuilder=stringBuilder.reverse();
                        //c=0;
                        str=str.concat(ssa[2]);
                       // stringBuilder.append(ssa[2]);
                    }
                    else {
//                    char ss=ssa[2].charAt(0);
                       // StringBuffer stringBuilder1=new StringBuffer(ssa[2]);
                        //String strr=ss+String.valueOf(stringBuilder);
                       // stringBuilder=stringBuilder1.append(stringBuilder);
                        str=ssa[2].concat(str);
                    }
//                    if(c%2!=0){
//                        stringBuilder=stringBuilder.reverse();
//                       // c=0;
//                    }
//                    StringBuilder stringBuilder1=new StringBuilder(ssa);
//                    //String strr=ss+String.valueOf(stringBuilder);
//                    stringBuilder=stringBuilder1.append(stringBuilder);
                }
                else{
//                    String ssa = scanner.next();

                    if(c%2!=0){
//                        stringBuilder=stringBuilder.reverse();
                        //c=0;
                       // StringBuffer stringBuilder1=new StringBuffer(ssa[2]);
                        //String strr=ss+String.valueOf(stringBuilder);
                        //stringBuilder=stringBuilder1.append(stringBuilder);
                        str=ssa[2].concat(str);
                    }
                    else {
//                    char ss=ssa[2].charAt(0);
//                        stringBuilder.append(ssa[2]);
                        str=str.concat(ssa[2]);
                    }
                }
            }
        }
        if(c%2==0){
            //stringBuilder=stringBuilder.reverse();
            printWriter.println(str);

        }
        else{
            for(int j=str.length()-1;j>=0;j--){
                printWriter.print(str.charAt(j));

            }
        }
        printWriter.flush();
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
