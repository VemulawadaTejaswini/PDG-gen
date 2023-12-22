import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
      	Integer ItemA = sc.nextInt();
      	int sum = 0;
      	int out = ItemA;
      	for(int i = 1; i < num; i++){
       	Integer ItemB = sc.nextInt(); 
          if(out < ItemB){
            sum = sum + out;
            out = ItemB;
          } else{
            sum = sum + ItemB;
          }
        }
      	sum = sum + out / 2;
      	System.out.println(sum);
	}
}