import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int baseTmp = scanner.nextInt();
        int preferableTmp = scanner.nextInt();
        int[] location = new int[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            location[i] = scanner.nextInt();
        }
        double tmpDif = 0;
        double currentDif = 0;
        int targetIndex = 0;
        for(int j=0; j<location.length; j++) {
            tmpDif = Math.abs((baseTmp - location[j] * 0.006) - preferableTmp);
            if(j == 0) {
                targetIndex = j;
                currentDif = tmpDif;
            }
            if(currentDif > tmpDif) {
                targetIndex = j;
                currentDif = tmpDif;
            }
        }
        System.out.println(targetIndex+1);
    }
}
