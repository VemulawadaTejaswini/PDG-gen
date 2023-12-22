import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<MyDto> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            MyDto dto = new MyDto();
            dto.a = sc.nextInt();
            dto.b = sc.nextInt();
            list.add(dto);
        }

        Collections.sort(list, new MyComp());

        long a = 0;
        long b = 0;
        boolean flg = true;
        for (MyDto dto : list) {
            if (flg) {
                a += dto.a;
            } else {
                b += dto.b;
            }
            flg = !flg;
        }
        System.out.println(a- b);
    }
}

class MyComp implements Comparator<MyDto> {
    public int compare(MyDto c1, MyDto c2) {
        if(c1.getWa() < c2.getWa()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class MyDto{
    int a;
    int b;
    public int getSa(){
        return a - b;
    }
    public int getWa(){
        return a + b;
    }
}
