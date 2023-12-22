import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	int sum=0;

    	List<Integer> data=new ArrayList<Integer>();

    	int result=1;

    	data.add(result);

    	while(true) {

    		if(N>=result*9) {
    			result*=9;
    			data.add(result);
    		}else {
    			break;
    		}

    	}

    	result=1;

    	while(true) {

    		if(N>=result*6) {
    			result*=6;
    			data.add(result);
    		}else {
    			break;
    		}

    	}

    	Collections.sort(data,Comparator.reverseOrder());


    	for(Integer I:data) {

    		if(N/I>0) {
    			sum+=N/I;
    			N=N%I;
    		}
    	}



    	System.out.println(sum);


    }


}

