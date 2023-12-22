import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> timelist = new ArrayList<>();
        ArrayList<Integer> firstdigits = new ArrayList<>();
        int tempval = 0;
        int amountOfTime = 0;
        boolean lastOrder = false;
        
        for(int i=0; i<5; i++){
            tempval = sc.nextInt();
            firstdigits.add(tempval%10);
            timelist.add(tempval);
        }
        Collections.sort(firstdigits);
        
        for(int i=0; i<5; i++){
            if(lastOrder==false && (timelist.get(i)%10==firstdigits.get(0))){
                lastOrder = true;
                amountOfTime += timelist.get(i);
            }
            else if(timelist.get(i)%10!=0){
                amountOfTime += (timelist.get(i) + (10-timelist.get(i)%10));
            }
            else{
                amountOfTime += timelist.get(i);
            }
        }
        System.out.println(amountOfTime);
    }
}