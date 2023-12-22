import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		long N = scan.nextLong();
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long num = scan.nextLong();
			list.add(num);
		}
		Object[] arrays = list.toArray();
		
		Arrays.sort(arrays);
		long tempt = 0;
		long count = 1;
	
		if(arrays.length!=0){
			tempt = (long) arrays[0];
		}else{
			count = 0;
		}
		
		if(arrays.length == 1){
			if(count != (long)arrays[0]){
				arrays[0] = null;
			}
		}else{
			for (int i = 1; i < arrays.length; i++) {
				if( (long) arrays[i] == tempt){
					if(count == (long)arrays[i]){
						tempt = (long) arrays[i];
						arrays[i] = null;
					}else{
						count++;
						if(i == arrays.length-1){
							if(count != (long)arrays[i-1]){
								for (int j = 0; j <= i; j++) {
									if(arrays[j]!=null && tempt == (long) arrays[j]){
										arrays[j] = null;
									}
								}
								
							}
						}
						if(arrays[i] != null){
							
							tempt = (long) arrays[i];
						}
					}
				}else{
					if(count != (long)arrays[i-1]){
						for (int j = 0; j < i; j++) {
							if(arrays[j]!=null && tempt == (long) arrays[j]){
								arrays[j] = null;
							}
						}
						
					}
					
					count = 1;
					tempt = (long) arrays[i];
				}
			}
			
		}
		
		
		count = 0;
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i] == null){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
