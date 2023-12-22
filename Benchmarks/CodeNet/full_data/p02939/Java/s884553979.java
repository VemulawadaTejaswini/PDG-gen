import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_moji=new ArrayList<String>();

		loop:for(int i=0;list.size()>i;i++) {
			//System.out.println(i);
			if(i==0) {
				list_moji.add(list.get(i));
				//list.remove(i);
				continue;
			}

			else if(i!=0) {
				String add="";

				while(true) {
					if(i==list.size())
						break loop;
					add=add+list.get(i);
					//System.out.println(add);
					if(add.equals(list_moji.get(list_moji.size() - 1))) {
						i++;
						continue;
					}
					else {
						list_moji.add(add);
						break;
					}
				}
			}
			//System.out.println(list_moji);
		}

		System.out.println(list_moji.size());
		/*
		while(true) {
			if(roop==0) {
				list_moji.add(list.get(roop));
				roop++;
				continue;
			}
			int tuika = roop;

			while(true) {

				String add="";
				add=add+list.get(tuika);
				if(add.equals(list_moji.get(list_moji.size() - 1))) {
					tuika++;
					continue;
				}
				else {
					list_moji.add(add);
					break;
				}
			}
			roop++;
		}
		 */

	}

}