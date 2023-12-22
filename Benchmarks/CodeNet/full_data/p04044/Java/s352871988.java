import java.util.*;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args){
      
  		Scanner sc = new Scanner(System.in);
        
        String[] line = sc.nextLine().split(" ");

        int num = Integer.parseInt(line[0]);
        int length = Integer.parseInt(line[1]);
        
        String[] arr = new String[num];

        for(int i = 0;i < num;i++){

            arr[i] = sc.nextLine();

        }

        Arrays.sort(arr);

        StringBuilder result = new StringBuilder();
        for(int i = 0;i < num;i++){
            result.append(arr[i]);
        }

        System.out.println(result.toString());
    }
}