import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sumHyo = 0;
        int norma = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int hyo = scan.nextInt();
            sumHyo += hyo;
            list.add(hyo);
        }
        scan.close();

        if(sumHyo % (m * 4) == 0) norma = sumHyo / (m * 4);
        else norma = (sumHyo / (m * 4)) + 1;

        for(int i = 0;i < list.size(); i++){
            if(!(list.get(i) < norma)) count++;
        }

        if(count >= m) System.out.println("Yes");
        else System.out.println("No");

    }
}