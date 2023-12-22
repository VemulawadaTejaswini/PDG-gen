import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] stringList = new String[n];
        char[][] character = new char[n][10];
        for (int i=0;i<n;i++){
            stringList[i] = scanner.next();
            for (int j=0;j<10;j++){
                character[i][j] = stringList[i].charAt(j);
            }
        }
        int count = 0;
        for (int i=0;i<n;i++){
            Arrays.sort(character[i]);
            for (int j=i+1;j<n;j++){
                Arrays.sort(character[j]);
                if (Arrays.equals(character[i], character[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
