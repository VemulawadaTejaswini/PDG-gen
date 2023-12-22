import java.util.*;
public class Main{

 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i =0;i<n;i++){
          list[i] = sc.nextInt();
        }
        int first = list[0];
        int min = list[0] - 1;
        String judge = "Yes";
        for(int i=1;i<n;i++){
          if(min <= (list[i] - 1)){
              min = list[i] - 1;
          }else if(min == list[i]){
              min = list[i];
          }else{
              judge = "No";
          }
        }
        
        System.out.println(judge);
      
    }

}