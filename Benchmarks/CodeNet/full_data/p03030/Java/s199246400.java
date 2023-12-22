import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
		
	String[] info = new String[number];
	for(int i = 0; i < number; i++) {
		info[i] = sc.next() + "," + (Integer.MAX_VALUE - sc.nextInt()) + "," + (i+1);
    }
    Arrays.sort(info);
    for(int j=0;j < number; j++){
        String ans = info[j].split(",")[2];
    	System.out.println(ans);
    }
  }
}
    