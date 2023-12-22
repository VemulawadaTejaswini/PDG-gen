import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String line = lines[0];
        String[] a = line.split(" ");
        int term = Integer.parseInt(a[0]);
        int num = Integer.parseInt(a[1]);

        String line1 = lines[1];
        String[] b = line1.split(" ");
        //int cost = Integer.parseInt(b[i]);

        for (int i = 0; i < num; i++){
            int cost = Integer.parseInt(b[i]);
            term = term - cost;
        }
        if (term < 0){
            System.out.println("-1");
        } else if (term >= 0){
            System.out.println(term);
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
  
}
