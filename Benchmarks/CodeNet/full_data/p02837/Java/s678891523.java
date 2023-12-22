//package BeginnerContest147;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    static class Person{
        ArrayList<Integer> honest;
        ArrayList<Integer> dishonest;
        int i;
        public Person(int i){
            honest = new ArrayList<>();
            dishonest = new ArrayList<>();
            this.i = i;
        }
    }
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Person[] list = new Person[n];
        for(int i = 0; i<n; i++){
            list[i] = new Person(i);
            int a = sc.nextInt();
            for(int j = 0; j<a; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                x--;
                if(y == 0){
                    list[i].dishonest.add(x);
                }
                else{
                    list[i].honest.add(x);
                }
            }
        }
        int max = -1;
        loop : for(int i = 0; i <= (1 << n); i++){
            int count = 0;
            boolean possible = true;
            //System.out.println("hey");
            for(int j = 0; j<n; j++){
                if((i & (1 << j)) > 0){
                    count++;
                    Person p = list[j];
                    for(int k : p.honest){
                        if((i & (1 << k)) == 0){
                            continue loop;
                        }
                    }
                    for(int k : p.dishonest){
                        if((i & (1 << k)) > 0){
                            continue loop;
                        }
                    }
                }
            }
            max = Math.max(count, max);
        }
        if(max == -1)
            max = 0;
        pw.println(max);
        pw.close();
    }

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
}