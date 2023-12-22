//https://atcoder.jp/contests/abc114/tasks/abc114_c

import java.io.*;

class Main{
    static int N;
    static int ans = 0;
    static String[] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        N = Integer.parseInt(str);
        a = new String[str.length()];
        dfs(0);
        System.out.println(ans);
    }

    public static void func(){
        int _3 = 0;
        int _5 = 0;
        int _7 = 0;
        int _a;
        for (int i=0;i<a.length;i++){
            if (a[i].equals("0")){
                if (_3!=0 || _5!=0 || _7!=0){
                    return;
                }
            }
            if(a[i].equals("3")){
                _3++;
            } else if (a[i].equals("5")){
                _5++;
            } else if (a[i].equals("7")){
                _7++;
            }
        }
        if (_3!=0 && _5!=0 && _7!=0){
            _a = Integer.parseInt(String.join("",a));
            if (_a<=N){
                ans++;
            }
        }
    }

    public static void dfs(int pos){
        if (pos==a.length){
            func();
        } else {
            a[pos] = "0";
            dfs(pos+1);
            a[pos] = "3";
            dfs(pos+1);
            a[pos] = "5";
            dfs(pos+1);
            a[pos] = "7";
            dfs(pos+1);
        }
    }
}