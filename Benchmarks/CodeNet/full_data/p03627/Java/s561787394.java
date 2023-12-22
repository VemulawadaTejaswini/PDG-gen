import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] 鶏 = new int[n];
                for(int i = 0 ; i < n ; i++){
                        鶏[i] = sc.nextInt();
                }
                int[] 烏 = new int[2];
                Arrays.fill(烏 , 0);
                int 鷹 = 0;
                sc.close();
                Arrays.sort(鶏);
                for(int i = n - 1 ; i > 0 && 鷹 < 2 ; i--){
                        if(鶏[i] == 鶏[i - 1]){
                                i--;
                                烏[鷹] = 鶏[i + 1];
                                鷹++;
                        }
                }
                System.out.println(烏[0] * 烏[1]);
        }
}