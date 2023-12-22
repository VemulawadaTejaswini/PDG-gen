import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        
        
        for(int i = 0;i < 5;i++){
            n[i] = sc.nextInt();
        }
        
        int betwen = sc.nextInt();
        
        int max = n[0];
        int min = n[0];
        
        for(int i : n){
            if(max < i){
                max = i;
                
            }
            if(min > i){
                min = i;
            }
        }
        
        if(max - min <= betwen){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }
}