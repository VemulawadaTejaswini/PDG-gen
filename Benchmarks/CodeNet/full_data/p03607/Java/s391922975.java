import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        ArrayList<Long> A = new ArrayList<>();
        for (int i=0;i<N;i++){
            str = br.readLine();
            A.add(Long.parseLong(str));
        }
        Collections.sort(A);
        int ans = 0;
        int cnt = 1;
        for (int i=1;i<N;i++){
            if (A.get(i-1)==A.get(i)){
                cnt++;
            } else {
                if (cnt%2!=0){
                    ans++;
                }
                cnt = 1;
            }
        }
        if (cnt%2!=0){
            ans++;
        }
        System.out.println(ans);
    }
}