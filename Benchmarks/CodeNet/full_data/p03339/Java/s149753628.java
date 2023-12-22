import java.util.*;

class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void out(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        String str = scan.next();
        int min = n;

        for (int i = 0; i < n; i++) {
            String cut1 = str.substring(0, i);
            String cut2 = str.substring(i+1);

            ArrayList<String> has1 = new ArrayList<String>();
            for (int j = 0; j < cut1.length(); j++) {
                has1.add((String.valueOf(cut1.charAt(j))));
            }
            Collections.sort(has1);

            ArrayList<String> has2 = new ArrayList<String>();
            for (int j = 0; j < cut2.length(); j++) {
                has2.add((String.valueOf(cut2.charAt(j))));
            }
            Collections.sort(has2);

            int ind1 = has1.size() - has1.indexOf("W");
            int ind2 = has2.indexOf("W");


            ind1++;
            if(ind2 == (-1)){ind2++;}
            int temp = ind1+ind2;
            if(min > temp){
            min = temp;
        }

        }
        out(min);
    }
}