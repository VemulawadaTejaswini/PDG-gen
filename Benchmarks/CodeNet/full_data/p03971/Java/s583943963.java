import java.io.*;
import java.math.*;
import java.util.*;





public class Main {

    static MyScanner in = new MyScanner();
    static   PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int N;
    static int max = 200001;
    static int [] dr = {1,-1,0,0};
    static int [] dc={0,0,-1,1};
    public static void main(String args[]) throws IOException {
            int N = in.nextInt();//the numebr of parcitpatns
            //Jap and over can pass the Qialification
            //a pariitpcare rank i the in qulaitfaiotn
            /**
             * b mwans the particpatn rank i is an oversea stdeunt 
             * c mean the parict rank i is neither of therese
             * program in decend rna yes.
             * No A+B
             */
            int A = in.nextInt(); int B = in.nextInt();
            String S = in.nextLine();
            int pass =0;
            int count =0;
            for(int i=0;i<S.length();i++){
                //the oversee fwer and A+B
                //and the student ranks B or above among all overseas student
                char person  = S.charAt(i);
                if(person=='a'){
                        if(pass<A+B){
                            pass++;
                            System.out.println("Yes");
                        }else{
                           System.out.println("No");
                        }
                }else if( person=='b'){
                    if(pass<A+B){
                        if(count<B){
                            pass++;
                            count++;
                           System.out.println("Yes");
                        }else{
                           System.out.println("No");
                        }
                    }else{
                       System.out.println("No");
                    }
                }else{
                   System.out.println("No");
                }
            }



        out.flush();
        }
       static boolean isEven(long a){
            return (a&1)==0;
        }
       static  void swap (int a, int b){

        int temmp = b;
        b=a;
        a = temmp;
        }
        static boolean same(int [] arr,int [] temp){
            Arrays.sort(arr);
           Arrays.sort(temp);
            for(int i=0;i<arr.length;i++){
                if(temp[i]!=arr[i])
                return false;
            }
            return true;
        }

 
  


    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
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
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
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