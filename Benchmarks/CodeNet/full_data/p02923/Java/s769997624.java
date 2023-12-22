import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int z =0;
        for (int i=0; i<n-1; i++){
            if (arr[i]==arr[i+1]) z++;
        }

        if (n==1){
            System.out.println(0);
        }else if((z-1)==arr.length){
            System.out.println(z);
        }else {

            int a = 0;

            for (int i = n - 1; i >= 1; i--) {
                if (arr[i - 1] >= arr[i]) {
                    a++;
                    if (i==1){
                        list.add(a);
                    }
                } else {
                    list.add(a);
                    a = 0;
                }
            }
            Collections.sort(list);
            System.out.println(list.get(list.size() - 1));
        }
    }
}
