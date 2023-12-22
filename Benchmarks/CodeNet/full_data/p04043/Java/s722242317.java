import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] intArray = Arrays.stream(sc.nextLine().split(" ")) 
                        .mapToInt(Integer::parseInt) 
                        .toArray();                       
        int five=0;
        int seven =0;
        int i=0;
        while(i < 3){
            if(intArray[i]==5){
                five++;
            }else if(intArray[i]==7){
                seven++;
            }
            i++;
        }
        
            if(five==2&&seven==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
        
    }
}