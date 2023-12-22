import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        char[][] strArray = new char[n][10];

        for(int i = 0; i < n; i++){
            strArray[i] = sc.next().toCharArray();
            Arrays.sort(strArray[i]);
            for(int j = 0; j < i; j++){
                if(Arrays.equals(strArray[i], strArray[j])){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}