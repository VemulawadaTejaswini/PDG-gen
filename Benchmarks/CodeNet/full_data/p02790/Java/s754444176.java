import java.util.*;

public class Main{  

    public static void main(String args[]){    
        Scanner console = new Scanner(System.in);
        int repeat = console.nextInt();
        int num = console.nextInt();
        String nums = "";
        for(int i = 0; i < repeat; i++){
         nums += num;
        }
        System.out.println(nums);
    }
       
}