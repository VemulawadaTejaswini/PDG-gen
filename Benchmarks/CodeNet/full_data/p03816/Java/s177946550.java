import java.util.ArrayList;
import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int n=sc.nextInt();
		int count=0;
		for (int i=0;i<n;i++){
			int temp=sc.nextInt();
			if(a.indexOf(temp)==-1){
				a.add(temp);
			}
			else{
				count++;
			}
		}
		if(count%2==0){
			System.out.println(a.size());
		}
		if(count%2==1){
			System.out.println(a.size()-1);
		}

	}

}