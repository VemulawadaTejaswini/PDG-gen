import java.io.*;
import java.util.ArrayList;

class Main{
    static int N;
    static ArrayList<Integer> C = new ArrayList<>();
    static ArrayList<Integer> S = new ArrayList<>();
    static ArrayList<Integer> F = new ArrayList<>();
    static ArrayList<Integer> time = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        N = Integer.parseInt(str);
        String[] s = new String[3];
        for (int i=0;i<N-1;i++){
            str = br.readLine();
            s = str.split(" ");
            C.add(Integer.parseInt(s[0]));
            S.add(Integer.parseInt(s[1]));
            F.add(Integer.parseInt(s[2]));
        }
        C.add(0);
        S.add(0);
        F.add(0);
        for (int i=0;i<N;i++){
            time.add(move(i,0));
        }
        for (int i=0;i<N;i++){
            System.out.println(time.get(i));
        }
    }

    static int move(int i,int now){
        if (i == N-1){
            return now;
        }
        if (now >= S.get(i) && now % F.get(i)!=0){
            now += F.get(i) - now % F.get(i);
        } else if (now < S.get(i)){
            now = S.get(i);
        }
        return move(i+1,now+C.get(i));
    }
}