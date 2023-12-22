import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] vitalArray = new int[N];
        for(int i = 0; i < N; i++){
            vitalArray[i] = sc.nextInt();
        }
        int[] vitalAfterBattle = Arrays.copyOf(vitalArray, vitalArray.length);
        int[] vitalBeforeBattle = new int[N];
        
        while(isNotEnough(vitalBeforeBattle, vitalAfterBattle)){
            vitalBeforeBattle = Arrays.copyOf(vitalAfterBattle, vitalAfterBattle.length);
            vitalAfterBattle = attackByWeakest(vitalAfterBattle);
        }
        
        System.out.println(minButNotZero(vitalAfterBattle));
    }
    private static int[] attackByWeakest(int[] vitalArray){
        int min = minButNotZero(vitalArray);
        for(int i = 0; i < vitalArray.length; i++){
            if(min != vitalArray[i]) vitalArray[i] = vitalArray[i] % min;
        }
        return vitalArray;
    }
    private static boolean isNotEnough(int[] vitalArray, int[] vitalAfterBattle){
        for(int i = 0; i < vitalArray.length; i++){
            if(vitalArray[i] != vitalAfterBattle[i]) return true;
        }
        return false;
    }
    private static int minButNotZero(int[] vitalArray){
        int min = 1000000000;
        for(int i = 0; i < vitalArray.length; i++){
            if(vitalArray[i] != 0 && min > vitalArray[i]) min = vitalArray[i];
        }
        return min;
    }
}
