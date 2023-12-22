    ////////////////////////////////////////////////////
    //                                                //
    //  For her who keeps the fire kindling in me...  //
    //                                                //
    ////////////////////////////////////////////////////

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStream;
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    // import java.util.Scanner;
    // import java.util.Arrays;
    // import java.util.ArrayList;
    // import java.util.Collections; 
    // import java.util.StringTokenizer;
    import java.util.*;
    import java.lang.Math;
    import java.awt.Point;

    import java.awt.geom.*;

    class Main {

        public static void main(String args[]) {
            try {
                FastReader s = new FastReader();
                BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
                int i, j, k, v, t, key, n, size, poster, minglob, minloc, beg, end, begl, endr, ind, l, r;// doub, b;
                long ans, f, ansmin, count, maxcount, x, y, x1, y1, x2, y2, x3, y3, x4, y4, sum1x, sum2x, sum3x, sum4x, sum1y, sum2y, sum3y, sum4y, max;
                boolean flag;
                
                n = s.nextInt();

                x1=0l; y1=0;
                x2=0l; y2=0;
                x3=0l; y3=0;
                x4=0l; y4=0;
                for(i=0; i<n; i++){
                    x = s.nextLong();
                    y = s.nextLong();
                    if(x>=0 && y >=0){
                        x1+=x;      y1+=y;
                    }else if(x<=0 && y<=0){
                        x2+=x;      y2+=y;
                    }else if(x<0 && y >=0){
                        x3+=x;      y3+=y;
                    }else if(x>=0 && y<0){
                        x4+=x;      y4+=y;
                    }
                }

                sum1x = x1 + x3;
                sum1y = y1 + y3;

                sum2x = x2 + x3;
                sum2y = y2 + y3;

                sum3x = x1 + x4;
                sum3y = y1 + y4;

                sum4x = x2 + x4;
                sum4y = y2 + y4;

                max = (sum1x*sum1x) + (sum1y*sum1y);
                max = (long)Math.max(max, (sum2x*sum2x) + (sum2y*sum2y));
                max = (long)Math.max(max, (sum3x*sum3x) + (sum3y*sum3y));
                max = (long)Math.max(max, (sum4x*sum4x) + (sum4y*sum4y));


                w.write(Math.sqrt(max)+ "\n");
                w.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // ========================================### FAST IO
    // ###=========================================//
    class FastReader {
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
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        Double nextDouble() {
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
    // ====================================================================================================//