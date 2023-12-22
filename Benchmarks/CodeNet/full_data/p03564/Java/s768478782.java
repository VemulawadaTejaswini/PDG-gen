import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
        int iline1 = Integer.parseInt(line1);
        int iline2 = Integer.parseInt(line2);
        int retans = 1;
        for(int i=0;i<iline1;i++){
        	retans = (retans * 2) < (retans + iline2) ? (retans * 2) : (retans + iline2);
        }
        System.out.println(retans);
    }
}
