import java.util.*;

public class Main {
    static class Item {
        int size = 0;
        int value = 0;
    
        public Item(int size, int value) {
            this.size = size;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sizes = scan.nextLine().split(" ");
        int size = Integer.parseInt(sizes[0]);
        int maxW = Integer.parseInt(sizes[1]);

        Queue<Item> data = new PriorityQueue<Item>(new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                if (i1.value == i2.value) {
                    if (i1.size == i2.size) return 0;
                    return i1.size - i2.size;
                } else {
                    return i1.value - i2.value;
                }
            } 
        });

        for (int i = 0 ; i < size ; i++) {
            String[] s = scan.nextLine().split(" ");
            data.add(
                new Item(Integer.parseInt(s[0]), Integer.parseInt(s[1]))
            );
        }
        scan.close();

        int resValue = 0;
        
        while(!data.isEmpty() || maxW == 0) {
            Item i = data.poll();
            if (i.size > maxW) continue;
            resValue+=i.value;
            maxW-=i.size;
        }

        System.out.print(resValue);
    }
}