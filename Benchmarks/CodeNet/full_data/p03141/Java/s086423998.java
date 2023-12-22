import java.util.*;


public class Main {
    
    private static long takahashi = 0;
    private static long aoki = 0;
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        // 皿の数
        int count = Integer.parseInt(line);
        
        List<Food> foodList = new ArrayList<>();
        
        while(sc.hasNextLine()) {
            String[] taPoint = sc.nextLine().split(" ");
            
            int t = Integer.parseInt(taPoint[0]);
            int a = Integer.parseInt(taPoint[1]);
            
            foodList.add(new Food(t, a));
        }
        
        for(int i = 0; i < count; i++) {
            if(i % 2 == 0) {
                eat(foodList, 't', 'a');
            } else {
                eat(foodList, 'a', 't');
            }
        }
        
        System.out.println(takahashi - aoki);
    }
    
    private static void eat(List<Food> foodList, char h1, char h2) {
        int ownMax = 0;
        int ownTotal = 0;
        int ownDiff = 0;
        int ownSoe = 0;
        int eneMax = 0;
        int eneTotal = 0;
        int eneDiff = 0;
        int eneSoe = 0;
        
        int soe = 0;
        
        for(int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            // 自分の最大ポイントを探す
            if(ownMax <= f.getPoint(h1)) {
                // 自分の最大ポイントが同じ場合、トータルで比較する
                if(ownMax == f.getPoint(h1) && ownTotal <= f.getTotal()) {
                    // 自分の最大ポイントの場合最大ポイントとトータルを保持しておく
                    ownMax = f.getPoint(h1);
                    ownTotal = f.getTotal();
                    ownDiff = f.getDiff(h1);
                    ownSoe = i;
                } else if(ownMax < f.getPoint(h1)){
                    // 自分の最大ポイントの場合最大ポイントとトータルを保持しておく
                    ownMax = f.getPoint(h1);
                    ownTotal = f.getTotal();
                    ownDiff = f.getDiff(h1);
                    ownSoe = i;
                }
            }
            
            // 相手の最大ポイントを探す
            if(eneMax <= f.getPoint(h2)) {
                if(eneMax == f.getPoint(h2) && eneTotal <= f.getTotal()) {
                    // 相手の最大ポイントの場合、最大ポイントとトータルを保持しておく
                    eneMax = f.getPoint(h2);
                    eneTotal = f.getTotal();
                    eneDiff = f.getDiff(h2);
                    eneSoe = i;
                } else if(eneMax < f.getPoint(h2)) {
                    // 相手の最大ポイントの場合、最大ポイントとトータルを保持しておく
                    eneMax = f.getPoint(h2);
                    eneTotal = f.getTotal();
                    eneDiff = f.getDiff(h2);
                    eneSoe = i;
                }
            }
        }
        
        // 自分と相手の最大とトータルが出たら比較する
        // 自分+, 相手+ の場合
        if(ownDiff >= 0 && eneDiff >= 0) {
            if(ownDiff > eneDiff) {
                soe = ownSoe;
            } else if(ownDiff < eneDiff) {
                soe = eneSoe;
            } else if(ownDiff == eneDiff) {
                soe = ownSoe;
            }
        } else { //if(ownDiff >= 0 && eneDiff < 0) {
            if(ownTotal > eneTotal) {
                soe = ownSoe;
            } else if(ownTotal < eneTotal) {
                soe = eneSoe;
            } else if(ownTotal == eneTotal) {
                soe = ownSoe;
            }
        }
        
        if(h1 == 't') {
            // 高橋の時
            takahashi += (long)foodList.get(soe).getPoint(h1);
        } else {
            // 青木の時
            aoki += (long)foodList.get(soe).getPoint(h1);
        }
        
        foodList.remove(soe);
    }
    
    
}

class Food {
    // 高橋ポイント
    private int t;
    // 青木ポイント
    private int a;
    
    public Food(int t, int a) {
        this.t = t;
        this.a = a;
    }
    
    public int getTotal() {
        return t + a;
    }
    
    public int getPoint(char h) {
        if(h == 't') {
            return t;
        } else {
            return a;
        }
    }
    
    public int getDiff(char h) {
        if(h == 't') {
            return t - a;
        } else {
            return a - t;
        }
    }
}