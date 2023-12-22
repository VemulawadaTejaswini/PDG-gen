import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> minus = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num < 0) minus.add(num);
            else plus.add(num);
        }
        int selectMinus = k;
        if(selectMinus > minus.size()) selectMinus = minus.size();
        int selectPlus = k - selectMinus;
        int min = 200000000;
        while(selectPlus <= plus.size()){
            int minValue = 0;
            int maxValue = 0;
            if(selectMinus != 0){
                minValue = minus.get(minus.size() - selectMinus);
            }
            if(selectPlus != 0){
                maxValue = plus.get(selectPlus -1);
            }
            int ans;
            if(Math.abs(minValue) < maxValue){
                ans = Math.abs(minValue)*2 + maxValue;
            }
            else ans = Math.abs(minValue) + maxValue*2;
            if(ans < min) min = ans;
            selectMinus--;
            selectPlus++;
        }
        System.out.println(min);
    }
}