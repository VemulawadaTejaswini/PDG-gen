import java.util.*;
     
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      	int index = new Integer(scan.nextLine());
        String[] scanLine = scan.nextLine().split(" ");
      	int[] ranges = new Integer()[count];
        int range = 0;
        for(int i=0;i<count;i++){
            range += (index - new Integer(scanLine[i]))*(index - new Integer(scanLine[i]));
        }
      
        System.out.println(range);
    }
}