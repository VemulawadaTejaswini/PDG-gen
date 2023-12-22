import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dataCount = sc.nextInt();

        // レート表
        LeaderBoard board = new LeaderBoard();

        for (int i = 0; i < dataCount; i++) {
            board.addRate(sc.nextInt());
        }

        System.out.println(board.getMinPattern() + " " + board.getMaxPattern());
    }
}

class Rate {
    private Integer min;
    private Integer max;
    private boolean freeColor;

    public Rate(Integer min, Integer max, boolean freeColor) {
        this.min = min;
        this.max = max;
        this.freeColor = freeColor;
    }

    public boolean isInRange(int rate) {
        if (this.max != null) {
            if (this.min <= rate && this.max >= rate) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.min <= rate) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (freeColor ? 1231 : 1237);
        result = prime * result + ((max == null) ? 0 : max.hashCode());
        result = prime * result + ((min == null) ? 0 : min.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rate other = (Rate) obj;
        if (freeColor != other.freeColor)
            return false;
        if (max == null) {
            if (other.max != null)
                return false;
        } else if (!max.equals(other.max))
            return false;
        if (min == null) {
            if (other.min != null)
                return false;
        } else if (!min.equals(other.min))
            return false;
        return true;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public boolean isFreeColor() {
        return freeColor;
    }

    public void setFreeColor(boolean freeColor) {
        this.freeColor = freeColor;
    }
}

class LeaderBoard {
    private Map<Rate, Integer> rateDispersion;

    public LeaderBoard() {
        rateDispersion = new HashMap<>();

        // 初期データ生成
        rateDispersion.put(createRate(1, 399, false), 0);
        rateDispersion.put(createRate(400, 799, false), 0);
        rateDispersion.put(createRate(800, 1199, false), 0);
        rateDispersion.put(createRate(1200, 1599, false), 0);
        rateDispersion.put(createRate(1600, 1999, false), 0);
        rateDispersion.put(createRate(2000, 2399, false), 0);
        rateDispersion.put(createRate(2400, 2799, false), 0);
        rateDispersion.put(createRate(2800, 3199, false), 0);
        rateDispersion.put(createRate(3200, null, true), 0);
    }

    public void addRate(int rate) {

        // 指定範囲内のrateに人数を加算
        for (Rate key : rateDispersion.keySet()) {
            if (key.isInRange(rate)) {
                rateDispersion.put(key, rateDispersion.get(key) + 1);

                return;
            }
        }
    }

    public int getMaxPattern() {
        int patterns = 0;

        for (Map.Entry<Rate, Integer> entry : rateDispersion.entrySet()) {
            if (!entry.getKey().isFreeColor() && entry.getValue() != null && entry.getValue() > 0) {
                patterns += 1;
            }
        }

        // 色自由分の計算
        List<Rate> freeColorList = new ArrayList<>();

        for (Map.Entry<Rate, Integer> entry : rateDispersion.entrySet()) {
            if (entry.getKey().isFreeColor()) {
                freeColorList.add(entry.getKey());
            }
        }

        for (Rate freeColorRate : freeColorList) {
            Integer count = rateDispersion.get(freeColorRate);

            for (int i = 0; i < count; i++) {
                patterns += 1;
            }
        }

        return patterns;
    }

    public int getMinPattern() {
        int patterns = 0;
        boolean foundFreeColor = false;

        // 色自由をカウントしなければ最小値
        for (Map.Entry<Rate, Integer> entry : rateDispersion.entrySet()) {
            if (!entry.getKey().isFreeColor() && entry.getValue() != null && entry.getValue() > 0) {
                patterns += 1;
            }

            if (!foundFreeColor && entry.getKey().isFreeColor() && entry.getValue() != null && entry.getValue() > 0) {
                foundFreeColor = true;
            }
        }

        if (foundFreeColor && patterns == 0) {
            patterns = 1;
        }

        return patterns;
    }

    private Rate createRate(Integer min, Integer max, boolean freeColor) {
        return new Rate(min, max, freeColor);
    }

}