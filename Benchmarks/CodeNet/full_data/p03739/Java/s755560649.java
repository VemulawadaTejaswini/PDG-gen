import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] list = new int[sc.nextInt()];
        for (int i=0; i < list.length ; i++){
            list[i] = sc.nextInt();
        } 
        
        int beforeSum = 0;
        int cnt = 0;
        for (int i=0; i < list.length ; i++){
            int sum = beforeSum + list[i];
            if(i != 0){
                if( beforeSum * sum > 0) {
                    int orgNum = list[i];
                    list[i] = - (beforeSum + beforeSum/Math.abs(beforeSum));
                    cnt += Math.abs(orgNum - list[i]);
                    sum = beforeSum + list[i];
                }
                else if (beforeSum * sum == 0){
                    list[i] -= beforeSum/Math.abs(beforeSum);
                    cnt++;
                    sum = beforeSum + list[i];
                }
            }
            beforeSum = sum;
        }
        
        System.out.println(cnt);
    }
}
