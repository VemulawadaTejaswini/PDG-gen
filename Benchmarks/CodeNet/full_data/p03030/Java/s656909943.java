import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
  		Scanner $ = new Scanner(System.in);
        int N = $.nextInt();
    	int id =1;
    	List<Town> ts = new ArrayList<>();
    	while(N-- != 0){
         	Town t = new Town();
           	t.id = id;
            id++;
            t.town = $.next();
          	t.ten = $.nextInt();
          	ts.add(t);
        }  
    
		Comparator<Town> com = (t1, t2) -> t1.town.compareTo(t2.town);
    	Comparator<Town> comX = (t1,t2) -> t2.ten - t1.ten;
    	ts.sort(com.thenComparing(comX));
    	ts.forEach(tX-> System.out.println(tX.id));
  }

	static class Town {
		String town;
		int ten;
		int id;
	}
}