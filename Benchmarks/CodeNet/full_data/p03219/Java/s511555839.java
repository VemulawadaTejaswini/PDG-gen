import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int black=0;
        int white=0;
        int count=0;

        for(int i=str.length()-1; i>=0; i==){
            if(str.charAt(i).equals("B")){
                count += white;
            }else{
                white++;
            }
        }

        System.out.println(count);

 
    }



}