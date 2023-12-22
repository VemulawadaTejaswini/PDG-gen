import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int stepNum = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0 ; i< stepNum; i++){
            int intA = sc.nextInt();
            int insertNum = sc.nextInt();
            for(int j=0; j < insertNum; j++){
                list.add(intA);
            }
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(k-1));
    }
}