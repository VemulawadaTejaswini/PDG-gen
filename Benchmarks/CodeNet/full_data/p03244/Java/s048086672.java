import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenV[] = new int[n/2];
        int oddV[] = new int[n/2];
        HashSet<Integer> evenNum = new HashSet<>();
        HashMap<Integer,Integer> evenCount = new HashMap<>();
        HashSet<Integer> oddNum = new HashSet<>();
        HashMap<Integer,Integer> oddCount = new HashMap<>();

        for(int i=0;i<n;i++){
            if(i%2==0)evenV[i/2]=sc.nextInt();
            else oddV[i/2]=sc.nextInt();
        }
        
        for(int i=0;i<evenV.length;i++){
            if(evenNum.contains(evenV[i])){
                int temp = evenCount.get(evenV[i]);
                evenCount.remove(evenV[i]);
                evenCount.put(evenV[i],temp+1);
            }else{
                evenNum.add(evenV[i]);
                evenCount.put(evenV[i],1);
            }
        }
        for(int i=0;i<evenV.length;i++){
            if(oddNum.contains(oddV[i])){
                int temp = oddCount.get(oddV[i]);
                oddCount.remove(oddV[i]);
                oddCount.put(oddV[i],temp+1);
            }else{
                oddNum.add(oddV[i]);
                oddCount.put(oddV[i],1);
            }
        }

        int even1 = mode(evenNum,evenCount);
        evenNum.remove(even1);
        int even2 = mode(evenNum,evenCount);

        int odd1 = mode(oddNum,oddCount);
        oddNum.remove(odd1);
        int odd2 = mode(oddNum,oddCount);

        int conf = 0;

        //System.out.println(even1 +" "+ even2 +" "+ odd1+" "+odd2);

        if(even1==odd1){
            if(evenCount.get(even2)==null||oddCount.get(odd2)==null){
                conf=evenCount.get(even1);
            }else {
                if (evenCount.get(even2) >= oddCount.get(odd2)) {
                    conf = evenCount.get(even2) + oddCount.get(odd1);
                } else {
                    conf = evenCount.get(even1) + oddCount.get(odd2);
                }
            }
        } else {
            conf = evenCount.get(even1)+ oddCount.get(odd1);
        }

        System.out.println(n-conf);


        
    }
    private static int mode(HashSet<Integer> num,HashMap<Integer,Integer> count){
        int max=0;
        int mode = 0;
        for(Integer i:num){
            if(max<count.get(i)){
                max=count.get(i);
                mode=i;
            }
        }
        return mode;
    }
}
