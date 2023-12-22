import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] line = sc.nextLine().split(" ");
        
        int[] targetArray = new int[num];
        for(int i = 0;i < num;i++){
            targetArray[i] = Integer.parseInt(line[i]);         	
        }
        
        int result = 0;
        boolean breakFlg = false;
        
        while(true){
            
            for(int i = 0;i < num ;i++){
                if(targetArray[i] % 2 == 0){
                    targetArray[i]  /= 2;
                }else{
                    breakFlg = true;
                    break;
                }
            }
          	if(breakFlg){
            	break;
            }
			result++;
        }
        System.out.println(result);
    }
}