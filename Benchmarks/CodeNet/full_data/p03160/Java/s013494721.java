import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number_of_elements = sc.nextInt();
      	int intArray[] = new int[number_of_elements];
      	int index = 0;
      	while(sc.hasNextInt()){
          intArray[index++] = sc.nextInt();
        }
      int dpArray[] = new dpArray[intArray.length];
      cost = 0;
      dpArray[0]=0;
      dpArray[1]=intArray[1]-intArray[0];
      for(int i =2 ;i<dpArray.length;i++){
      	dpArray[i]=Math.min(dpArray[i-2]+Math.abs(intArray[i]-intArray[i-2]),dpArray[i-1]+Math.abs(intArray[i]-intArray[i-1]));
      }
      System.out.println(dpArray[dpArray.length-1]);
	}
}
