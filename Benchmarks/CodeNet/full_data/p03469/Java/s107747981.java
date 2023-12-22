import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String line = sc.nextLine();
       String []array = line.split("");
       array[3] = "8";
       
       for(int i = 0; i < array.length; i++){
           if(i == array.length){
               System.out.println(array[i]);
           }else{
               System.out.print(array[i]);
           }
           
       }
    }
}
