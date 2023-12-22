import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> h = new ArrayList<>();
        for (int i=0;i<n;i++){
            h.add(scanner.nextInt());
        }
        int count = 0;

        while (Collections.max(h)>0){
            count += counter(h);
            for (int i=0;i<n;i++){
                if (h.get(i)>0){
                    h.set(i,h.get(i)-1);
                }
            }
        }
        System.out.println(count);

    }
    public static int counter(ArrayList<Integer> num){
        int count = 0;
        for (int i=0;i<num.size()-1;i++){

            if ((num.get(i)==0)!=(num.get(i+1)==0)){
                count++;
            }
        }
        if (num.get(0)>0) count++;
        if (num.get(num.size()-1)>0) count++;
        count /= 2;
        return count;
    }

}
