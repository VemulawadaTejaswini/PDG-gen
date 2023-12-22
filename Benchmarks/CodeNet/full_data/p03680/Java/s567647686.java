import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> num = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            num.add(scan.nextInt());
        }
        
        List<Integer> num2 = new ArrayList<>();
        int buttonNum = num.get(0);
        num2.add(buttonNum);

        int count = 0;
        int answer = -1;
        
        while(true) {
            buttonNum = num.get(buttonNum-1);
            
            if(num2.contains(buttonNum)) {
                break; 
            }
            
            if(buttonNum == 2) {
                count += 2;
                answer = count;
                break;
            }
            num2.add(buttonNum);
            count++;
        }
        System.out.println(answer);
    }
}
