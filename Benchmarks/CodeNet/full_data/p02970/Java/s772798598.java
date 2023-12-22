import java.util.*;
 
class Main
{
    public static void main(String[] args){
   		ArrayList<String> lines = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
		}
		int intN = Integer.parseInt(lines.get(0));
		int intD = Integer.parseInt(lines.get(1));
		
        int observer = (int)Math.ceil(intN/(intD*2+1));
        
        System.out.println(observer);
    }
}