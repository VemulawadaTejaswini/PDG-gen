import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] line = str.split("");
        String temp = line[0];
        int changeIndex = 0;
        int count = 0;
        for(int i = 1; i < line.length; i++){
            if(temp.equals(line[i])){
                if(line[i].equals("0")){
                    line[i] = "1";
                }else{
                    line[i] = "0";
                }
                count++;
            }
            temp = line[i];
        }
        System.out.println(count);
        
    }
}
