import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner inpunt = new Scanner(System.in);
        int x ,y ;
        String result="";
        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();

        for(int i=0;i<y;i++){
           
            arr.add(inpunt.nextLine());
         
        }

        Collections.sort(arr);

        for(int i=0;i<y;i++){
            result += arr.get(i);
        }

        System.out.println(result);


        
    }
}