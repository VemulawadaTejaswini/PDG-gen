
import java.lang.reflect.Array;
import java.util.*; import java.io.*;
/*
 * untitled.java
 * Copyright 2019 Karan Kanojia <karankanojia@Karans-MacBook-Air.local>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */ public class Main{

    static Reader scan = new Reader(); static Scanner scanner = new Scanner(System.in);
    static int MAX = 111111, bit_max = 32, ALPHA_LIMIT = 30, SQRT_BUCKET = 555, lim = 1000000007;
    static HashMap<Long, Long> quickHash = new HashMap<>();
    static long watcher = 0;
    static StringBuffer stringBuffer;

    static long permutes(ArrayList<ArrayList<Long>> ptr){
        long sum = 0; if(ptr.size() < 3){return 0L;}
        for(ArrayList<Long> bucket : ptr) {
            sum+= bucket.size();
        }
        if(sum < 3){return 0L;} long jojo = 0;
        for(ArrayList<Long> bucket : ptr){
            if(bucket.size() > 1){
                jojo += (bucket.size()*(bucket.size()-1))/2;
            }
        }
        long mojo = (sum*(sum-1)*(sum-2))/6;
        //System.out.println(sum+" "+mojo+" "+jojo);
        return mojo-(jojo*(sum-2));
    }

    public static long solve(HashMap<Integer, HashSet<Integer>> map, int n){
        long answer =0 ;
        for(int center=0; center<n; center++){
            if(map.get(center).size() < 3){continue;}
            HashSet<Integer> vis = new HashSet<>();
            ArrayList<ArrayList<Integer>> buk = new ArrayList<>();
            for(int i : map.get(center)){buk.add(new ArrayList<>()); buk.get(buk.size()-1).add(i);}

        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        HashMap<String, Long> map = new HashMap<>();
        long max = 0;
        for (int i = 0; i < n; i++) {
            String curr = scanner.next();
            if (!map.containsKey(curr)) {
                map.put(curr, 0L);
            }
            map.put(curr, map.get(curr) + 1);
            max = Long.max(max, map.get(curr));
        }
        ArrayList<String> arr = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s) == max){arr.add(s);}
        }
        //System.out.println(map);
        Collections.sort(arr);
        for(String s : arr){
            System.out.print(s+" ");
        }System.out.println();
    }





    static class Reader {
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