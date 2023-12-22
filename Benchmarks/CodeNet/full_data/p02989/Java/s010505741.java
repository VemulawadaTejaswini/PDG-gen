import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer numSize = scan.nextInt();
        int maxNum = 0;
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < numSize; i++) {
            int temp = scan.nextInt();
            array.add(temp);
            if(maxNum < temp)
             maxNum = temp;
        }
        
        int arrayArc = 0;
        int arrayAbc = 0;
        int numOfAnswer = 0;
        
        for(int i = 1; i < maxNum; i++) {
            for(int j = 0; j < numSize; j++) {
                if(array.get(j) >= i)
                    arrayArc++;
                else
                    arrayAbc++;
            }    
            if(arrayArc == arrayAbc)
                numOfAnswer++;
            arrayAbc = 0;
            arrayArc = 0;
        }
        
        System.out.println(numOfAnswer);
    }
}
