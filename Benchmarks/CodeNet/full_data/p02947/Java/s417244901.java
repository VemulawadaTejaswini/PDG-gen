import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num];
        
        for (int i = 0;i < num;i++){
            char[] chars = in.next().toCharArray();
            Arrays.sort(chars);
            arr[i] = new String(chars);
        }
        int count = 0;
        
        for (int i = 0;i < num - 1;i++){
            int kai = 0;
            int kaicount = 0;
            for (int j = i + 1;j < num;j++){
                if (!(arr[i].equals("-")) && arr[i].equals(arr[j] )){
                    arr[j] = "-";
                    kaicount ++;
                    if (kai == 0){
                        kai = 1;
                    }else{
                        kai *=kaicount + 1;
                    }
                    
                }else if(arr[i].equals("-")){
                    break;
                }
                //System.out.println(arr[i] + " " + arr[j] + " " + kaicount + " " + kai + " " + count);
            }
            count += kai;
        }
        System.out.println(count);

    }
}
