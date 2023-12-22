import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 0;
        for(int i=1;i<=a;i++){String s = String.valueOf(i); 
                              if(s.length()%2==1){b++;
                                                 }
                             }
		System.out.println(b);
	}
}
