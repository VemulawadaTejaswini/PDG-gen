import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());

		String str=sc.next();
		String sh="#";
		String dottt=".";
		int cnt,cnt2,change;

		String[] str2=str.split(""); //一文字ずつ取り出す
		String[] str3=str.split("");
		cnt=0;
		cnt2=0;

		while(true){
			change=0;
			for(int i=0;i<n-1;i++){
				if(str2[i].equals(sh)==true&&str2[i+1].equals(dottt)==true){
					cnt+=1;
					str2[i+1]=sh;
					change=1;
				}
			}
			if(change==0)break;
		}
		while(true){
			change=0;
			for(int i=0;i<n-1;i++){
				if(str3[i].equals(sh)==true&&str3[i+1].equals(dottt)==true){
					cnt2+=1;
					str3[i]=dottt;
					change=1;
				}
			}
			if(change==0)break;
		}
		if(cnt>cnt2)cnt=cnt2;
		System.out.println(cnt);
		sc.close();

	}

}