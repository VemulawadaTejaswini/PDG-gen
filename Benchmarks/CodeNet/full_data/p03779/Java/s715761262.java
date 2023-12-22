import java.util.*;
public class Main{

	public static int x;
	public static int min = 1000000001;

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		cal(0,0);
		System.out.println(min);
	}

	public static void cal(int s,int d){
		
		//合致
		if(x==d){
			if(s<min){
			min = s;
			return;
		}
		}

		//枝切り
		if(x<=s){return;}
		
		for(int i=0; i<2; i++){
		//左下チェック
			if(i==0){
		s++;
		cal(s,d);
		s--;}
			if(i==1){
		//右下チェック
		s++;
		d+=s;
		cal(s,d);
		d-=s;
		s--;}
		}
	}
}