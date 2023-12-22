import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        Map<Integer,String> problemMap = new HashMap<>();
        int AC = 0;
        int WA = 0;
        for(int i=0;i<M;i++){
            int probNo = Integer.parseInt(sc.next());
            String str = sc.next();
            if(problemMap.containsKey(probNo) && problemMap.get(probNo).equals("AC"))continue;
            problemMap.put(probNo,str);
            if(str.equals("AC")){
                AC++;
            }else{
                WA++;
            }
        }
        System.out.println(AC + " " + WA);
    }
}
