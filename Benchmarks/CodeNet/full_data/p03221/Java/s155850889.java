import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		ArrayList<ArrayList<Info>> list = new ArrayList<ArrayList<Info>>();
		for(int i = 0; i < N; i++) list.add(new ArrayList<Info>());
		
		for(int i = 0; i < M; i++){
			int index = i;
			int P = sc.nextInt();
			int Y = sc.nextInt();
			Info f = new Info();
			f.index = i;
			f.year = Y;
			list.get(P-1).add(f);
		}
		
		for(int i = 0; i < N; i++) Collections.sort(list.get(i), new yearComparator());
		
		ArrayList<Info> ansList = new ArrayList<Info>();
		for(int i = 0; i < N; i++){
			ArrayList<Info> pList = list.get(i);
			for(int j = 0; j < pList.size(); j++){
				Info f = pList.get(j);
				String number = String.format("%06d%06d", (i + 1), (j + 1));
				f.number = number;
				ansList.add(f);
			}
		}
		
		Collections.sort(ansList, new indexComparator());
		
		for(Info f : ansList){
			System.out.println(f.number);
		}
		
		/*
		for(int i = 0; i < N; i++){
			for(Info f : list.get(i)){
				System.out.println(f.index + " " + f.year + " " + f.number);
			}
		}
		*/
	}
	
	public static class yearComparator implements Comparator<Info> {
		@Override
		public int compare(Info info1, Info info2) {
			return info1.year < info2.year ? -1 : 1;
		}
	}
	
	public static class indexComparator implements Comparator<Info> {
		@Override
		public int compare(Info info1, Info info2) {
			return info1.index < info2.index ? -1 : 1;
		}
	}
	
	public static class Info{
		int index = 0;
		int year = 0;
		String number = "";
	}
}