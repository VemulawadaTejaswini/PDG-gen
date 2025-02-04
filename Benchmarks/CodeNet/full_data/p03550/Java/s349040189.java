import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String arr[] = line.split(" ", 0);
        
        int N = Integer.parseInt(arr[0]);
        int Z = Integer.parseInt(arr[1]);
        int W = Integer.parseInt(arr[2]);
        
        line = scanner.nextLine();
        String arr2[] = line.split(" ", 0);
        int nums[] = new int[N];
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(arr2[i]);
        }
        
        Player x = new Player(Z);
        Player y = new Player(W);
        
        boolean isX = true;
        for (int i=0; i<N; i++) {
            int card = nums[i];
            if (isX) {
                x.deleteMinCard();
                x.cards.add(card);
                // isX = false;
                if (x.isMaxCard(card)) {
                    // isX = false;
                }
            } else {
                x.deleteMaxCard();
                y.cards.add(card);
                isX = true;
            }
        }
        int res = x.getSum() - y.getSum();
        
        if (res<0) {
            res *= -1;
        }
        
        System.out.println(res);
        
    }
    
    
    static class Player {
        List<Integer> cards;
        
        Player(int init) {
            cards = new ArrayList<Integer>();
            cards.add(init);
        }
        
        boolean isMaxCard(int num) {
            int max=0;
            for(int i : cards) {
                if (max<i) {
                    max=i;
                }
            }
            
            if (max<=num) {
                return true;
            }
            return false;
        }
        
        boolean isMinCard(int num) {
            int min=100000000;
            for(int i : cards) {
                if (min>i) {
                    min=i;
                }
            }
            
            if (min>=num) {
                return true;
            }
            return false;
        }
        
        void deleteMaxCard() {
            
            if (cards.size()==0) {
                return;
            }
            
            int index=0;
            
            int save=0;
            for (int i=0; i<cards.size(); i++) {
                if (save<cards.get(i)) {
                    save = cards.get(i);
                    index = i;
                }
            }
            
            cards.remove(index);
        }
        
        void deleteMinCard() {
            if (cards.size()==0) {
                return;
            }
            
            int index=0;
            
            int save=100000000;
            for (int i=0; i<cards.size(); i++) {
                if (save>cards.get(i)) {
                    save = cards.get(i);
                    index = i;
                }
            }
            
            cards.remove(index);
        }
        
        int getSum(){
            int sum=0;
            for (int num : cards) {
                sum += num;
            }
            return sum;
        }
    }
}