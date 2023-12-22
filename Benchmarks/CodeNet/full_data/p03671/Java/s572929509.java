


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int n =scan.nextInt();

        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        for(int i=0;i<n;i++){
            a.add(scan.nextInt());
        }

        for(int i=0;i<n;i++){
            b.add(a.get(i));
            Collections.reverse(b);
        }

        for(int i=0;i<n;i++){
            System.out.print(b.get(i)+" ");
        }
    }

}


