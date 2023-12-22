import java.util.*;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String text = "";
        if(C >= A && C <=B){
            text = "Yes";
        }else{
            text = "No";
        }
        System.out.println(text);
	}
}