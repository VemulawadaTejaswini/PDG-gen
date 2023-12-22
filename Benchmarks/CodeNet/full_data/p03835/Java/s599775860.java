import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int K = s.nextInt();
		int S = s.nextInt();
		
		int count = 0;
		for(int i = 0; i < K + 1; i++) {
			for(int j = 0; j < K + 1; j++) {
				for(int k = 0; k < K + 1; k++) {
					if(i + j + k == S) {
						count++;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
    }
}
