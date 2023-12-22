import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        List<char[]> list = new LinkedList<>();
        char[][] strArray = new char[n][10];

        for(int i = 0; i < n; i++){
            char[] charArray = sc.next().toCharArray();
            Arrays.sort(charArray);
            for(char[] item: list){
                if(Arrays.equals(charArray, item)){
                    count++;
                }
            }
            list.add(charArray);
        }

        System.out.println(count);
    }
}