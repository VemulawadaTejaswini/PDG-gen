import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int time=0;
        int place=0;
        while(true){
            time++;
            place+=time;
            if(place>=x){
                System.out.println(time);
                return;
            }
        }
    }
}