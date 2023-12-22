import java.util.*;
public class Main {
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
    	String str = s.next();
    	String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
    	int[] l = {6,5,4,3,2,1,7};
    	for (int i = 0; i < 7; i++){
			if (str.equals(day[i])) System.out.println(l[i]);

		}

}
}