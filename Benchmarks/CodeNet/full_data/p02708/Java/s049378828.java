import java.util.*;

public class Main {
	//途中まで
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        long count = 0;
        long sum = 0;
        
		List<Long> list = new ArrayList<Long>(); 
		//listに計算した合計値をaddしていく
      
        //２個選ぶ
        for(int i=0; i<n+1; i++){
        for(int j=i+1; j<n+1; j++){
        	list.add(2*Math.pow(10,100)+i+j);
        }
        }

        List<Long> listB = new ArrayList<Long>(new HashSet<>(list));
        System.out.println("ListB = " + listB);

        //３個選ぶ
        for(int i=0; i<n+1; i++){
        for(int j=i+1; j<n+1; j++){
        for(int s=j+1; s<n+1; s++){
        	list.add(3*2*Math.pow(10,100)+i+j+s);
        }
        }
        }

        List<Long> listC = new ArrayList<Long>(new HashSet<>(list));
        System.out.println("ListC = " + listC);

	    scan.close();	
    }
    

}