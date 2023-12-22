import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int yy = 0;
		int xx=0;
		
		while (scanner.hasNextLine()) {
		    String sc = scanner.nextLine();
			i++;
			//1行目はスキップ
			if(i==1){
				continue;
			}
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			String[] list = sc.split(" ", 0);
			//2行目
			if(i==2){
			for(int j=0; j<list.length; j++){
				list2.add(Integer.parseInt(list[j]));
			}
    	    Collections.sort(list2);
    	    Integer x = list2.get(0);
			xx = x.intValue();
			}
			//3行目
			if(i==3){
			list = sc.split(" ", 0);
		    for(int j=0; j<list.length; j++){
				list2.add(Integer.parseInt(list[j]));
			}
		    Collections.sort(list2);
		    Integer y = list2.get(0);
		    yy = y.intValue();
			}
		}
		if(xx <= yy){
			System.out.print("War");	
		}else{
		     System.out.print("No War");
		}
	}
}

