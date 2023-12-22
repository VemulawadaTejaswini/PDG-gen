import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int areas = sc.nextInt();
		int citys = sc.nextInt();
		List area= new ArrayList();
		List cityTimes= new ArrayList();
		for (int i = 0; i < citys; i++) {
			area.add(sc.nextInt());
			cityTimes.add(sc.nextInt());
		}
		List areasList = new ArrayList();
		String str = "";
		for (int i = 1; i <= area.size(); i++) {
			str = ""+area.get(i-1);
			switch(str.length()){
			case 1:
				areasList.add("00000"+str);
				break;
			case 2:
				areasList.add("0000"+str);
				break;
			case 3:
				areasList.add("000"+str);
				break;
			case 4:
				areasList.add("00"+str);
				break;
			case 5:
				areasList.add("0"+str);
				break;
			case 6:
				areasList.add(""+str);
				break;
			}
		}
		Collections.sort(areasList);
		List resultList = new ArrayList();
		int temp=0;
		for (int i = 0; i < areasList.size(); i++) {
			boolean flag = areasList.contains(areasList.get(i).toString());
			if(flag){
				if(i != 0 && !areasList.get(i-1).toString().equals(areasList.get(i).toString())){
					temp=0;
				}
				temp++;
				switch((""+temp).toString().length()){
				case 1:
					resultList.add(areasList.get(i).toString()+"00000"+temp);
					break;
				case 2:
					resultList.add(areasList.get(i).toString()+"0000"+temp);
					break;
				case 3:
					resultList.add(areasList.get(i).toString()+"000"+temp);
					break;
				case 4:
					resultList.add(areasList.get(i).toString()+"00"+temp);
					break;
				case 5:
					resultList.add(areasList.get(i).toString()+"0"+temp);
					break;
				case 6:
					resultList.add(areasList.get(i).toString()+""+temp);
					break;
				}
			}
		}
		for (int i = 0; i <= resultList.size()-1 ; i++) {
			System.out.println(resultList.get(i));
		}
		sc.close();
	}
}
