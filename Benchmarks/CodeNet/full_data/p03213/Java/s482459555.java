import java.util.*;
 
public class Main {
	
	static Map<Integer, Integer> all_factor = new HashMap<>();

    static void factorize_each(int n){
        int div = 1;
        while(n > 1){
            
            div++;
            int cnt = 0;
            while(n % div == 0){
                cnt++;
                n /= div;
            }
            if(cnt == 0)
                continue;
                
            if(all_factor.get(div) != null){
                cnt += all_factor.get(div);
            }
            all_factor.put(div, cnt);

        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        for(int i = 1; i <= N; i++){
            factorize_each(i);
        }

        int ans = 0;

        for(Map.Entry<Integer, Integer> fst_entry : all_factor.entrySet()){
            int fst_key = fst_entry.getKey();
            int fst_val = fst_entry.getValue();
            
            if(fst_val < 4) continue;

            for(Map.Entry<Integer, Integer> scd_entry : all_factor.entrySet()){
                int scd_key = scd_entry.getKey();
                int scd_val = scd_entry.getValue();

                if(scd_key <= fst_key || scd_val < 4) continue;

                for(Map.Entry<Integer, Integer> thd_entry : all_factor.entrySet()){
                    int thd_key = thd_entry.getKey();
                    int thd_val = thd_entry.getValue();

                    if(thd_key == fst_key || thd_key == scd_key || thd_val < 2) continue;

                    ans++;
                }

                if(fst_val >= 14) ans++;
                if(scd_val >= 14) ans++;
            }
        }

        for(Map.Entry<Integer, Integer> fst_entry : all_factor.entrySet()){
            int fst_key = fst_entry.getKey();
            int fst_val = fst_entry.getValue();
            
            if(fst_val < 2) continue;
            if(fst_val >= 74) ans++;

            for(Map.Entry<Integer, Integer> scd_entry : all_factor.entrySet()){
                int scd_key = scd_entry.getKey();
                int scd_val = scd_entry.getValue();

                if(scd_key == fst_key || scd_val < 24) continue;
                
                ans++;
            }
        }

        System.out.println(ans);
    }
}