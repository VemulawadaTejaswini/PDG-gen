import java.util.*;
 
class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String point = sc.nextLine();
        String[] points = point.split(" ");
		double dN = Double.parseDouble(points[0]);
		double dD = Double.parseDouble(points[1]);
		
     	int observer = (int)Math.ceil((dN / (dD*2+1)));
        System.out.println(observer);
    }
}