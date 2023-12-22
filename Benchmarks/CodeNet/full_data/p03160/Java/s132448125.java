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
      int cost = 0;
      int dpArray0=0;
      int dpArray1=Math.abs(intArray[1]-intArray[0]);
      for(int i =2 ;i<dpArray.length;i++){
        int dpArray2 = dpArray1;
      	dpArray1=Math.min(dpArray0+Math.abs(intArray[i]-intArray[i-2]),dpArray1+Math.abs(intArray[i]-intArray[i-1]));
        dpArray0 = dpArray2;
      }
      System.out.println(dpArray1);
	}
}
