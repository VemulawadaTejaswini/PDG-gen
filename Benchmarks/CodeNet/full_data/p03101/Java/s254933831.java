import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rowCnt = console.nextInt();
        int colCnt = console.nextInt();
        
        console.nextLine();
        
        int rowNum = console.nextInt();
        int colNum = console.nextInt();
        
        int total = rowCnt * colCnt;
        int black = rowNum + colNum - 1;
        
        System.out.println(total - black);
    }
}
