import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
    static long getCom(int i){
        return i * (i-1) / 2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        HashMap<Long, Integer> data = new HashMap<Long, Integer>();

        long sum = 0;
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(input[i]);
            sum += x;
            if(data.containsKey(sum)){
                data.put(sum, data.get(sum) + 1);
            }else{
                data.put(sum, 1);
            }
        }
        
        long ans = 0;
        for(long x : data.keySet()){
            int hindo = data.get(x);
            ans += getCom(hindo);
        }

        if(data.containsKey(0l))
            ans += data.get(0l);

        System.out.println(ans);
    }
}