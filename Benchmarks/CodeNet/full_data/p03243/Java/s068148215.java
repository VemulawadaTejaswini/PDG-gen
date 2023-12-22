import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        
        int [] result = new int[3];
        
        for(int i = 0 ; i<3; i++){
            result[i] = Integer.parseInt(input.substring(i,i+1));
        }
        
    /*    for(int i = 0 ; i<3; i++){
            System.out.println(result[i]);
        }*/
        
        
        
        if(result[0]==result[1] && result[1]==result[2]){
            System.out.println(input);
        }
        else{
            if(result[0]>=result[1] && result[0]>=result[2]   ){
                System.out.print(result[0]);
                System.out.print(result[0]);
                System.out.print(result[0]);
            }
            else if(result[1]>result[0] || result[0]==result[1] && result[0]<result[2]){
                System.out.print((result[0]+1));
                System.out.print((result[0]+1));
                System.out.print((result[0]+1));
            }
        }
        
    }
}