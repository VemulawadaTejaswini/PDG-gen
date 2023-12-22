import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int s = scan.nextInt();
	ArrayList<Integer> a = new ArrayList<Integer>();

	a.add(s);

	int index = 1;
	int flag = -1;
	while(true){
	    if(a.get(index-1) % 2 == 0){
		a.add(a.get(index-1) / 2);
	    }else{
		a.add(3*a.get(index-1)+1);
	    }
	    for(int i = index-1; i >= 0; i--){
		if(a.get(index) == a.get(i)){
		    flag = 1;
		    break;
		}
	    }
	    if(flag == 1){
		break;
	    }
	    index++;
	}
	/*
	for(int i = 0; i < a.size(); i++){
	    System.out.println(a.get(i));
	}
	*/
	System.out.println(index+1);
    }
}
