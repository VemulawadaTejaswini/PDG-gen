import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int kidsValue = scanner.nextInt();
        int okasiValue = scanner.nextInt();
        int[] list = new int[kidsValue];
        for(int i = 0;i < kidsValue;i++){
            list[i] = scanner.nextInt();
        }
        int returnValue = 0;
        Arrays.sort(list);
        for(Integer integer : list){
            if(integer == okasiValue){
                returnValue++;
                break;
            }else if(integer > okasiValue){
                break;
            }else{
                okasiValue = okasiValue - integer;
                returnValue++;
            }
        }
        System.out.println(returnValue);
    }
}