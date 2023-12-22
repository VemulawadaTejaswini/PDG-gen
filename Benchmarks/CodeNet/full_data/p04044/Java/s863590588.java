import java.util.*;
public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int l=sc.nextInt();
	ArrayList<String> stateList = new ArrayList<String>();
	for(int i=0; i<n; i++){
	    stateList.add(sc.next());
	}
	Collections.sort(stateList);
	for(i=0;i<n i++){
	    System.out.print(stateList.get(i));
	}
    }
}
