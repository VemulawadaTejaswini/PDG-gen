import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String tile = sc.next();
		//System.out.println("tile");
		String[] tilec = tile.split("");

		int counter1=0;
		int counter2=0;
		for(i=0;i=tilec.length;i++){
			if(i%2 == 0){
				if(tilec[i]=='0'){
					counter1++				}
			}else{
				if(tilec[i]=='1'){
					counter1++
				}
			}
		}

		for(i=0;i=tilec.length;i++){
			if(i%2 == 0){
				if(tilec[i]=='1'){
					counter1++				}
			}else{
				if(tilec[i]=='0'){
					counter1++
				}
			}
		}

		if(counter1 >= counter2){
			System.out.println(counter2);
		}else{
			System.out.println(counter1);
		}
	}
}