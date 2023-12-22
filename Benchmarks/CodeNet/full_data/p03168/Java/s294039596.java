import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;
    static HashMap<String,Double> map;

    public static void solve() throws IOException {
        int n = nextInt();
        StringTokenizer st = new StringTokenizer(in.readLine());
        double[] arr = new double[n];
        for(int i = 0;i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        char[] state = new char[n];
        for(int i = 0;i<n;i++){
            state[i] = 'h';
        }
        map = new HashMap<>();
        double ans = recur(arr,state);
        System.out.println(ans);
    }

    static double recur(double[] arr, char[] state){
        String mystate = arrToString(state);
//        System.out.println(mystate);
        if(map.containsKey(mystate)){
//            System.out.println("Map helped");

            return 0;
        }

        if(moreT(state))
            return 0;

        int n = state.length;
        double tmpAns = sumOfState(arr,state);

        double tmpSum = 0;
        for(int i = 0;i<n;i++){
            if(state[i] == 'h'){
                char[] newChar = Arrays.copyOf(state,n);
                newChar[i] = 't';
                tmpSum +=recur(arr,newChar);
            }
        }
        map.put(mystate,tmpAns+tmpSum);
        return tmpAns+tmpSum;
    }

    static String arrToString(char[] arr){
        StringBuilder ans = new StringBuilder();
        for(char c : arr){
            ans.append(c);
        }

        return ans.toString();
    }
    static double sumOfState(double[] arr, char[] state){
        int n = state.length;
        double mul = 1;
        for (int i = 0; i < n; i++) {
            if(state[i] == 'h'){
                mul*=arr[i];
            }
            else{
                mul*=(1-arr[i]);
            }
        }

        return mul;
    }

    static boolean moreT(char[] state){
        int n = state.length;
        int countT= 0,countH = 0;
        for(char c : state){
            if(c =='t')
                countT++;
            else
                countH++;
        }

        if(countT >= countH)
            return true;
        return  false;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

