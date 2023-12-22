import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    static long findGCD(long number1, long number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
    static class node implements Comparator<node>{
        long first;
        long second;

        @Override
        public int compare(node o1, node o2) {
            if (o2.second <= o1.second) {
                if (o2.first > o1.first&& o2.second == o1.second) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            return -1;
        }
    }

        public static void main(String[] args) {
            FastReader sc = new FastReader();
            int n = sc.nextInt();
            node a[] = new node[n];
            for(int i=0; i<n; i++){
                a[i] = new node();
                a[i].first = sc.nextInt();
                a[i].second = sc.nextInt();
            }
            Comparator com = new node();
            Arrays.sort(a,com);
            boolean check = true;
            long time = 0;
            for (int i = 0; i < n; i++) {
                time += a[i].first;
                if (a[i].second < time) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            }
        }







