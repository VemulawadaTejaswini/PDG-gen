import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
        int b = sc.nextInt();
		Long c = "-1";
        for(int i=1;i<=10000;i++){if((i*108)/100==a && (i*110)/100==b){c=i;break;}}
		System.out.println(c);
	}
}
