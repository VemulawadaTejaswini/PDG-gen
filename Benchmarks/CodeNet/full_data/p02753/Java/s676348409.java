import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) 
  {
    String[] lines = getStdin();
    char[] buses = lines[0].toCharArray();
     
    if (buses[0] == buses[1] && buses[1] == buses[2])
    {
        System.out.print("No");
    }
    else
    {
    	System.out.print("Yes");
  	}
  }
  
  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
