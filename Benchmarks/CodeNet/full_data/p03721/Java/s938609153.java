import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int stepNum = sc.nextInt();
        int k = sc.nextInt();
        
        int[] ownNum = new int[100000];
        
        for(int i=0 ; i< stepNum; i++){
            int intA = sc.nextInt();
            int insertNum = sc.nextInt();
            ownNum[intA-1] += insertNum;
        }
        
        int sum=0;
        for(int i=0 ; i< ownNum.length; i++){
            sum += ownNum[i];
            if(sum >= k){
                System.out.println((i+1));
                break;
            }
        }
    }
}