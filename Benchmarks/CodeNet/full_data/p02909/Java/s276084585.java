
import java.util.Scanner;

public class Main {
			String[] ans={"Sunny","Cloudy","Rainy"};

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<3;i++)
			if(s.equals(ans[i]))
			{
				System.out.println(ans[(i+1)%3]);
				break;
			}
	}

}





