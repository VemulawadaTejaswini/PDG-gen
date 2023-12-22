import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int placeNum=sc.nextInt();
	int temp=sc.nextInt();
	int ideal=sc.nextInt();
	int ans=0;
	double dis=10000;
	int placeHigh[]=new int[placeNum];
	for(int i=0;i<placeHigh.length;i++) {
		placeHigh[i]=sc.nextInt();
		if(dis>Math.abs(ideal-(temp-placeHigh[i]*0.006))) {
			dis=Math.abs(ideal-(temp-placeHigh[i]*0.006));
			ans=i+1;
		}
	}
	System.out.println(ans);

}
}