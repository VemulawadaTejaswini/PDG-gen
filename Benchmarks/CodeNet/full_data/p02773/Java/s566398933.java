import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int inp_num = Integer.parseInt(sc.next());
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < inp_num; i++) {
            String s = sc.next();
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        int ma = -1;
        ArrayList<String> candidates = new ArrayList<>();
        for (Entry<String, Integer> ent : m.entrySet()) {
            if(ma == ent.getValue()){
                candidates.add(ent.getKey());
            }else if(ma < ent.getValue()){
                candidates.clear();
                ma = ent.getValue();
                candidates.add(ent.getKey());
            }
      }
      Collections.sort(candidates);
      for(String can : candidates){
        System.out.println(can);
      }
  }
}