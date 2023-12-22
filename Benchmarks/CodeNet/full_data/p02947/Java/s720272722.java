import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Map<String, Integer> count = new HashMap<>();
        for (int i=0; i<n; i++)
        {
            int[] indices = new int[30];
            String s=sc.next();
            for (char ch: s.toCharArray())
            {
                indices[ch-97]++;
            }
            String zip = "";
            for (int j=0; j<29; j++)
            {
                if (indices[j]>0) {
                    char c= (char) (j+97);
                    zip+=String.valueOf(indices[j])+c;
                }
            }

            Integer value = count.get(zip);
            if (value==null) {
                count.put(zip, 1);
            }
            else {
                count.put(zip, count.get(zip) + 1);
            }

        }

        int sum=0;
        for (String key: count.keySet()) {
            int value = count.get(key);
            if (value>1) sum+= (value* (value-1))/2;
        }

        System.out.println(sum);
    }
}