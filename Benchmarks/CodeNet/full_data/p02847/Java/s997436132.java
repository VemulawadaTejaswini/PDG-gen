import java.util.*;
public class Main {
    public static void main(String[] args) {
		String[] list={"SUN","MON","TUE","WED","THU","FRI","SAT"};
      	Scanner sc=new Scanner(System.in);
      	String s=sc.next();
      	int o=0;
      	for(int i=0;i<7;i++){
        	if(list[i].equals(s)){
            	o=7-i;
            }
        }
      	System.out.println(o);
    }
}