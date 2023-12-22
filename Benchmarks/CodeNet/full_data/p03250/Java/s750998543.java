import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main (String[] args){

	int[] data = new int[3];
	int max = 0;
	int tmp = 0;
	Scanner sc = new Scanner (System.in);
		data[0]=sc.nextInt();
		data[1]=sc.nextInt();
		data[2]=sc.nextInt();

	for(int i = 0; i < data.length; i++)
		max = Math.max(max,data[i]);


	for(int i = 0; i < data.length; i++){
		if(data[i] != max){
			tmp += data[i];
		}
	}

	max = max*10 + tmp;
		
		System.out.println(max);

  }

}