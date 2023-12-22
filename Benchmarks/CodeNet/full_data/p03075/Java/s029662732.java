import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i=0; i<5; i++){
          for(int j=0; j<5; j++){
         	if(Math.abs(array[i] - array[j]) > k){
              count = 1;
              break;
            }
          }
          if(count == 1) break;
        }
		if(count == 1) System.out.println(":(");
        else System.out.println("Yay!");
	}
}