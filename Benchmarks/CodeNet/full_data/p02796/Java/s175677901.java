import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
   
            int N = sc.nextInt();

            Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
            for(int i = 0; i < N; i++){
                int X = sc.nextInt();
                int L = sc.nextInt();
                map.put(X,L);
            }

            int leftArm = -1000000000;
            int rightArm = 0;
            int removeNum = 0; 
      
            for (Integer key : map.keySet()){

                if(leftArm + rightArm > key - map.get(key)){
                    removeNum++;

                    if(leftArm + rightArm > key + map.get(key)){
                        leftArm = key;
                        rightArm = map.get(key);
                    }
                
                }else{
                    leftArm = key;
                    rightArm = map.get(key);                   
                }
            }   
            int ans = N - removeNum;
            System.out.println(ans);
   
        sc.close();

        }catch(NoSuchElementException e){
			System.out.println("無効な値です");
		}
    }
}