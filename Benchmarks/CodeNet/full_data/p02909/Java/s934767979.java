
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 //     String[] sn=sc.nextLine().split(" ");
//int num=Integer.parseInt(sn[0]);
//int num2=Integer.parseInt(sn[1]);

String[] week={"Sunny", "Cloudy", "Rainy"};


      String sn=sc.nextLine();
//int num=Integer.parseInt(sn);


for(int i=0;i<3;i++){

if(sn.equals(week[i])){
System.out.println(week[(i+1)%3]);
}

}

//System.out.println(a/b);


	}
}