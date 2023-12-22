import java.util.Scanner;
     
public class InputSample {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().spilit(" ");
        Integer joinCount = str[0];
        Integer displayCount = str[1]
        Integer internalCount = 0;
        if(joinCount >= 10){
          internalCount = displayCount;
        }else{
          internalCount = (100*(10-joinCount))+displayCount;
        }
     	
        System.out.println(internalCount);
        scan.close();
    }
}