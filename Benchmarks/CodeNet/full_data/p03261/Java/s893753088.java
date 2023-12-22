import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] W = new String[N];
        for(int i=0;i<N;i++) W[i]=sc.next();
        String ans = help(N,W);
        System.out.println(ans);
    }
    static String help(int N, String[] W){
        HashSet<String> dic = new HashSet<>();
        dic.add(W[0]);
        String cur = "";
        for(int i=1;i<N;i++){
            cur = W[i];
            String last = W[i-1];
            if(dic.contains(cur)) return "No";
            if(cur.charAt(0)!=last.charAt(last.length()-1)) return "No";
            dic.add(cur);
        }
        return "Yes";
    }
}

