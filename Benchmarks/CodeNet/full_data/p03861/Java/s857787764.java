import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		Long x = sc.nextLong();
		int count = 0;
		for(int i=0;a<=b;i++){			
			if((a)%x==0){
				count=count+1;
			}
			a=a+1;
		}
		System.out.print(count);
		
	}

}
