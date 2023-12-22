import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, W);
        map.put(3, 0);
        map.put(4, H);

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            switch (a) {
            case 1:
                map.put(a, x > map.get(a) ? x : map.get(a));
                break;
            case 2:
                map.put(a, x < map.get(a) ? x : map.get(a));
                break;
            case 3:
                map.put(a, y > map.get(a) ? y : map.get(a));
                break;
            case 4:
                map.put(a, y < map.get(a) ? y : map.get(a));
                break;
            default:
                ;
            }
        }

        int width = map.get(2) - map.get(1);
        width = width > 0 ? width : 0;
        int height = map.get(4) - map.get(3);
        height = height > 0 ? height : 0;

        System.out.println(width * height);
    }
}

