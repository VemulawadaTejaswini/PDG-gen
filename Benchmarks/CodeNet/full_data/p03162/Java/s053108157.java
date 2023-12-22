
////......VACATION......////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
            return (Integer.parseInt(next()));
        }

        long nextLong() {
            return (Long.parseLong(next()));
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n=in.nextInt();
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
            a[i][2]=in.nextInt();
        }
        int max=Math.max(Math.max(a[0][0],a[0][1]),a[0][2]);
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    a[i][0]+=Math.max(a[i-1][1],a[i-1][2]);
                }else if(j==1){
                    a[i][j]+=Math.max(a[i-1][0],a[i-1][2]);
                }else{
                    a[i][j]+=Math.max(a[i-1][0],a[i-1][1]);
                }

                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
        /*for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
