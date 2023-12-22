import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            double b = a/1.08;
            int c = (int)b;
            int d = c+1;
            if((int)c*1.08 == a){
                System.out.println(c);
            }
            else if((int)d*1.08 == a){
                System.out.println(d);
            }
            else{
                System.out.println(":(");
            }
	}
}
