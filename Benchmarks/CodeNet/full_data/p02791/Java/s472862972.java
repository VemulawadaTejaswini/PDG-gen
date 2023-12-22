import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        int count = 0;
        out:for(int i=0; i<list.size(); i++){
            for(int j=0; j<=i; j++){
                if(list.get(i).compareTo(list.get(j))==1){
                    continue out;
                }
            }
            count += 1;
        }
        System.out.println(count);
    }
}