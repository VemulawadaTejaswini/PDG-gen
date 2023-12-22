import java.util.*;
import java.io.*;
public class Main {
public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int array[] = new int[n + 1];
	for(int i = 1;i <= n;i++){
		array[i] = Integer.parseInt(br.readLine());
	}
	long ans = array[1] - 1;
	array[1] = 1;
	int curr = 2;
	for(int i = 2;i <= n;i++){
		if(array[i] < curr)continue;
		if(array[i] > curr){
			ans += array[i]/curr;
				if(array[i] % curr == 0)--ans;
		}
		if(array[i] == curr)++curr;
	}
	System.out.print(ans);
}
}