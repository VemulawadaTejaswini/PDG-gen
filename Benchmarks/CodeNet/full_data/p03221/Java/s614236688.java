import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<CityInfo>cityInfoList = new ArrayList<CityInfo>();

		for(int i =0;i < m;i++) {
			CityInfo cityInfo = new CityInfo(i,sc.nextInt(),sc.nextInt());
			cityInfoList.add(cityInfo);
		}
		cityInfoList.sort((a,b) ->{
			if(a.getKen() == b.getKen()) {
				return a.getYear() - b.getYear();
			}else {
				return a.getKen() - b.getKen();
			}
		});
		int number = 1;
		for(int i =0;i < cityInfoList.size();i++) {
			if(i ==0) {
				cityInfoList.get(i).setBirthNumber(number);
				continue;
			}
			if(cityInfoList.get(i).getKen() ==cityInfoList.get(i-1).getKen()) {
				number++;
				cityInfoList.get(i).setBirthNumber(number);
			}else {
				number = 1;
				cityInfoList.get(i).setBirthNumber(number);
			}
		}
		cityInfoList.sort((a,b) ->{
			return a.getId() - b.getId();
		});
		for(CityInfo cityInfo: cityInfoList) {
			StringBuilder answer = new StringBuilder();
			String ken = String.valueOf(cityInfo.getKen());
			for(int i = 0;i <6-ken.length();i++) {
				answer.append("0");
			}
			answer.append(ken);
			String birthNumber = String.valueOf(cityInfo.getBirthNumber());
			for(int i = 0;i <6-birthNumber.length();i++) {
				answer.append("0");
			}
			answer.append(birthNumber);
			System.out.println(answer);
		}
	}
	private static class CityInfo{
		private int id;
		private int ken;
		private int year;
		private int birthNumber;
		public CityInfo(int id,int ken,int year) {
			this.id = id;
			this.ken = ken;
			this.year = year;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getKen() {
			return ken;
		}
		public void setKen(int ken) {
			this.ken = ken;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getBirthNumber() {
			return birthNumber;
		}
		public void setBirthNumber(int birthNumber) {
			this.birthNumber = birthNumber;
		}

	}
}