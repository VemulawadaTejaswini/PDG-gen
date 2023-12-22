import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int sanka = sc.nextInt();
        int point = sc.nextInt();
        int seikai = sc.nextInt();
        int key = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < sanka; i++){
            map.put(key, point);
            key++;
        }
        for(int i = 0; i < seikai; i++){
            int ans = sc.nextInt();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(ans == entry.getKey() + 1){
                    continue;
                }else{
                    int hoge = entry.getValue() - 1;
                    entry.setValue(hoge);
                    
                }
            }
        }
        for(int val : map.values()){
            if(val <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }     
}