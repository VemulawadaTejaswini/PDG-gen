import java.util.*;

class Main{
public static void main(String[] args){
	int count = 0;
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();//町の数
	int[] mons = new int[num+1];//n-1番目の街のモンスター数
	int[] yusya = new int[num];//n-1番目の勇者が倒せるモンスターの数
	for(int i = 0;i<num+1;i++){
		mons[i]=scan.nextInt();
	}
	for(int i = 0;i<num;i++){
		yusya[i]=scan.nextInt();
	}

	for(int i = 0;i<num;i++){
		if(mons[i]>=yusya[i])count+=yusya[i];
		else if((mons[i]+mons[i+1])<=yusya[i]){
			count+=mons[i]+mons[i+1];
			mons[i+1]=0;
		}else{
			count+=yusya[i];
			mons[i+1]= mons[i+1]-(yusya[i]-mons[i]);
		}
	}

	System.out.println(count);
}

}