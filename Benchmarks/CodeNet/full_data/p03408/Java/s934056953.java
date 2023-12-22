import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int plusnum = Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> plusMap = new HashMap<String,Integer>();
        HashMap<String,Integer> minusMap = new HashMap<String,Integer>();

        for(int i = 0;i < plusnum;i++){
            String word = sc.nextLine();

            if(plusMap.get(word) == null){
                plusMap.put(word,1);
            }else{
                plusMap.put(word,plusMap.get(word) + 1);
            }
        }

        int minusNum = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < minusNum;i++){
            String word = sc.nextLine();

            if(minusMap.get(word) == null){
                minusMap.put(word,1);
            }else{
                minusMap.put(word,minusMap.get(word) + 1);
            }
        }

        int max = 0;

        for(String key : plusMap.keySet()){

            int plusVal = plusMap.get(key);

            int minusVal = 0;
            if(minusMap.get(key) != null){
                minusVal = minusMap.get(key);
            }

            int result = plusVal - minusVal;
            
            if(result > max){
                max = result;
            }
        }

        System.out.println(max);
    }
}