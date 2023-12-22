import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int redNum = Integer.parseInt(sc.next());
        List<String> nameList = new ArrayList();
        List<String> redList = new ArrayList();
        for(int x = 1; x<= redNum; x++) {
            String name = sc.next();
            nameList.add(name);
            redList.add(name);
        }
        
        int blueNum = Integer.parseInt(sc.next());
        List<String> blueList = new ArrayList();
        for(int x = 1; x<= blueNum; x++) {
            String name = sc.next();
            nameList.add(name);
            blueList.add(name);
        }
        
        int x=1;
        
        int res = 0;
        loop:for(String name :nameList) {
            for(int y=1; y<x; y++) {
                if (nameList.get(y-1).equals(name)) {
                    x++;
                    continue loop;
                }
            }
            int money = 0;
            for(String blueName : blueList) {
                    if(blueName.equals(name)) {
                     money--;   
                }
            }
            for(String redName : redList) {
                if(redName.equals(name)) {
                    money++;   
                }
            }
            res = res >= money?res:money;
        }
        
        System.out.println(res);
    }
}