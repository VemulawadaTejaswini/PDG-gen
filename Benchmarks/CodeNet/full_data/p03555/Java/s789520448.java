import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
                String ret = "No";
                if(line1.charAt(0)==line2.charAt(2)){
                    if(line1.charAt(2)==line2.charAt(0)){
                        ret = "Yes";
                    }
		System.out.println(ret);
    }
}
