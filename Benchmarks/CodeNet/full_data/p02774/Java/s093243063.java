import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        ArrayList<LongInt> posi = new ArrayList<>();
        ArrayList<LongInt> nega = new ArrayList<>();
        long zeros = 0;

        for(int i = 0 ; i < n ; i++){
            long tmp = sc.nextLong();
            if(tmp > 0){
                posi.add(new LongInt(tmp));
            }else if(tmp < 0){
                nega.add(new LongInt(-tmp));
            }else{
                zeros++;
            }
        }
        long posis = posi.size();
        long negas = nega.size();
        long negaPs = posis*negas;
        long zeroPs = zeros*(posis+negas) + zeros*(zeros-1)/2;

        Collections.sort(posi);
        Collections.sort(nega);

        long ans = 0;
        if(k <= negaPs){
            long low = -posi.get(posi.size()-1).num*nega.get(nega.size()-1).num;
            long high = 0;
            do{
                long tmp = (low + high)/2;
                if(countOfUnderPairInNegative(posi, nega, tmp) >= k){
                    high = tmp;
                }else{
                    low = tmp;
                }
            }while(Math.abs(low-high) > 1);
            ans = low;
        }else if(k <= negaPs+zeroPs){
            ans = 0;
        }else{
            k -= negaPs+zeroPs;
            long low = 0;
            long high = 0;
            if(!posi.isEmpty()){
                high = Math.max(posi.get(posi.size()-1).num*posi.get(posi.size()-1).num, high);
            }
            if(!nega.isEmpty()){
                high = Math.max(nega.get(nega.size()-1).num*nega.get(nega.size()-1).num, high);
            }
            do{
                long tmp = (low + high)/2;
                if(countOfUnderPairInPositive(posi, nega, tmp) >= k){
                    high = tmp;
                }else{
                    low = tmp;
                }
            }while(Math.abs(low-high) > 1);
            ans = high;
        }
        System.out.println(ans);
    }

    static long countOfUnderPairInNegative(ArrayList<LongInt> posi, ArrayList<LongInt> nega, long product){
        long cnt = 0;
        product = -product;
        int j = nega.size()-1;
        for(int i = 0 ; i < posi.size() ; i++){
            if(j >= 0) {
                while (posi.get(i).num * nega.get(j).num > product) {
                    j--;
                    if (j < 0) {
                        break;
                    }
                }
            }
            cnt += (long)(nega.size()-j-1);
        }
        return cnt;
    }

    static long countOfUnderPairInPositive(ArrayList<LongInt> posi, ArrayList<LongInt> nega, long product){
        long cnt = 0;
        int j = posi.size()-1;
        for(int i = 0 ; i < posi.size()-1 && i < j ; i++){
            while (posi.get(i).num * posi.get(j).num > product) {
                j--;
                if (j <= i) {
                    break;
                }
            }
            cnt += (long)(j-i);
        }

        j = nega.size()-1;
        for(int i = 0 ; i < nega.size()-1 && i < j ; i++){
            while (nega.get(i).num * nega.get(j).num > product) {
                j--;
                if (j <= i) {
                    break;
                }
            }
            cnt += (long)(j-i);
        }
        return cnt;
    }
}

class LongInt implements Comparable<LongInt>{
    long num;

    LongInt(long num){
        this.num = num;
    }

    public int compareTo(LongInt tar){
        return Long.compare(num,tar.num);
    }
}
