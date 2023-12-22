import java.util.Scanner;

public class Main {
	static int N=0,M=0;
	static int[][] Map;
	static String[][] City;
	static String CityID,after,befor;
	static int CityNum,MinNum,MinFlg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Map = new int[M][3];
		City = new String[M][1];
		for(int i=0;i<M;i++) {
			Map[i][0]  =sc.nextInt();
			Map[i][1]  =sc.nextInt();
			Map[i][2]  =1;
		}
		int WhiCount;
		for(int i=1;i<=N;i++) {
			CityNum = 1;
			WhiCount = 0;
			while(WhiCount<M) {
				CityID = "";
				after = "";
				befor = "";
				if(Map[WhiCount][0] == i && Map[WhiCount][2] == 1) {
					MinNum = Map[WhiCount][1];
					MinFlg = WhiCount;
					for(int n=WhiCount;n<M;n++) {
						if(Map[n][0] == i && Map[n][1]<MinNum && Map[n][2] == 1) {
							MinNum = Map[n][1];
							MinFlg = n;
						}
					}
					befor = i+"";
					for(int m=0;m<6-(i+"").length();m++) {
						befor = "0"+befor;
					}
					after = CityNum+"";
					for(int m=0;m<6-(CityNum+"").length();m++) {
						after = "0"+after;
					}
					CityID = befor+after;
					City[MinFlg][0] = CityID;
					Map[MinFlg][2] =  0;
					CityNum++;
					if(MinFlg == WhiCount) {
						WhiCount++;
					}
				}else {
					WhiCount++;
				}
			}
		}
		for(int i=0;i<M;i++) {
			System.out.println(City[i][0]);
		}
		
	}

}
