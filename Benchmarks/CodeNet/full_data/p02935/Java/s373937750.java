import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<Integer> array =new ArrayList<>();
       for(int i=0;i<n;i++) {
    	   array.add(sc.nextInt());
       }
       Collections.sort(array);
       double temp=0;
       for(int i=0;i<n;i++) {
    	 if(i==0) {
    	 temp=(double)(array.get(i)+array.get(i+1))/2;
           i++;

    	 }else {
    		temp=(double)(temp+array.get(i))/2;
                    
    	 }
       }
       System.out.println(temp);
    }
}
