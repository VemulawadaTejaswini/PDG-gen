
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main (String[] args){


	Scanner sc =new Scanner(System.in);
	ArrayList<String> list=new ArrayList<String>();

	while(sc.hasNext()) {
		list.add(sc.next());
	}


	int i=0;
	
	if(list.get(0)==list.get(3)) i++;
	if(list.get(1)==list.get(4)) i++;
	if(list.get(2)==list.get(5)) i++;

	System.out.print(i);

}
}

