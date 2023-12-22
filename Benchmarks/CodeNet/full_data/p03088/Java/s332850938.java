import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        char[] acgt = {'A','C','G','T'};
        List<Map<String,Long>> dp = new ArrayList<>();
        Set<String> ng = new HashSet<>();
        int mod = 1000000007;
        ng.add("AGC");
        ng.add("ACG");
        ng.add("GAC");
        for(int i=0;i<n+1;i++)dp.add(new HashMap<>());
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    String s = ""+acgt[i]+acgt[j]+acgt[k];

                    if(!ng.contains(s))dp.get(3).put(s,1L);
                    
                }
            }
        }
        
        Long tmp,count;
        String s;
        for(int len=3;len<n;len++){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    for(int k=0;k<4;k++){
                        s = ""+acgt[i]+acgt[j]+acgt[k];
                        count = dp.get(len).get(s);
                        if(ng.contains(s))continue;
                        if(acgt[j]=='A' && acgt[k]=='G'){
                            for(int l=0;l<4;l++){
                                if(acgt[l] == 'C')continue;
                                tmp = dp.get(len+1).get("AG"+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put("AG"+acgt[l],count);
                                }else{
                                    dp.get(len+1).put("AG"+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }else if(acgt[j]=='A' && acgt[k]=='C'){
                            for(int l=0;l<4;l++){
                                if(acgt[l] == 'G')continue;
                                tmp = dp.get(len+1).get("AC"+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put("AC"+acgt[l],count);
                                }else{
                                    dp.get(len+1).put("AC"+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }else if(acgt[j]=='G' && acgt[k]=='A'){
                            for(int l=0;l<4;l++){
                                if(acgt[l] == 'C')continue;
                                tmp = dp.get(len+1).get("GA"+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put("GA"+acgt[l],count);
                                }else{
                                    dp.get(len+1).put("GA"+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }else if(acgt[i]=='A' && acgt[k]=='G'){
                            String ss = s.substring(1);
                            for(int l=0;l<4;l++){
                                if(acgt[l] == 'C')continue;
                                tmp = dp.get(len+1).get(ss+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put(ss+acgt[l],count);
                                }else{
                                    dp.get(len+1).put(ss+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }else if(acgt[i] == 'A' && acgt[j] == 'G'){
                            String ss = s.substring(1);
                            for(int l=0;l<4;l++){
                                if(acgt[l] == 'C')continue;
                                tmp = dp.get(len+1).get(ss+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put(ss+acgt[l],count);
                                }else{
                                    dp.get(len+1).put(ss+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }else{
                            String ss = s.substring(1);
                            for(int l=0;l<4;l++){
                                
                                tmp = dp.get(len+1).get(ss+acgt[l]);
                                if(tmp == null){
                                    dp.get(len+1).put(ss+acgt[l],count);
                                }else{
                                    dp.get(len+1).put(ss+acgt[l],(count+tmp)%mod);
                                }
                            }
                        }
                    }
                }
            }
        }
        long res = 0;
        for(Long val : dp.get(n).values()){
            res+=val;
            res%=mod;
        }
        System.out.println(res);
    }
}