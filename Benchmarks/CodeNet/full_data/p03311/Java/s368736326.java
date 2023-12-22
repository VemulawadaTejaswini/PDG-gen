import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int sum1=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            int num;
            list.add((num = sc.nextInt()));
            sum1 += num;
        }
        double max = sum1/4;
        int p=0,q=0,r=0,s = 0;
        int sum = 0;
        int flag = 0;
        int prev = 0;
        for(int i = 0;i<length;i++){
            sum+=list.get(i);
            if(sum>max){
                if(i-prev == 1){
                    switch (flag){
                        case 0:
                            p = list.get(i);
                            prev = i;
                            break;
                        case 1:
                            q = list.get(i);
                            prev = i;
                            break;
                        case 2:
                            r = list.get(i);
                            s = sum1-p-q-r;
                            System.out.println(sa(p,q,r,s));
                            return;
                    }
                    sum = 0;
                }else {
                    switch (flag) {
                        case 0:
                            p = sum - list.get(i);
                            prev = i;
                            break;
                        case 1:
                            q = sum - list.get(i);
                            prev = i;
                            break;
                        case 2:
                            r = sum - list.get(i);
                            s = sum1 - p - q - r;
                            System.out.println(sa(p, q, r, s));
                            return;
                    }
                    sum = list.get(i);
                }
                flag++;
            }
        }
    }
    private static int sa(int p, int q, int r, int s){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(p);
        list.add(q);
        list.add(r);
        list.add(s);
        Collections.sort(list);
        return list.get(3)-list.get(0);
    }
}