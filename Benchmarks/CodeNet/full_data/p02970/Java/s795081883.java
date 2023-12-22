import java.util.*;
 
class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
		}
		int intN = Integer.parseInt(lines.get(0));
		int intD = Integer.parseInt(lines.get(1));
		
        System.out.println(intN / (intD*2+1));
    }
}