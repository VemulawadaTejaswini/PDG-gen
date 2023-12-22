import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;

class Id
{
    public static String getId(int p, int x) {
        return String.format("%06d", p) + String.format("%06d", x);
    }
    
    public static void main(String args[])
    {
        class Io {
            public BufferedReader br;

            public Io() {
                InputStreamReader ir = new InputStreamReader(System.in);
                this.br = new BufferedReader(ir);
            }
            
            public ArrayList<Integer> inputInts() {
                String[] inputParts = {""};
        
                try { 
                    inputParts = br.readLine().split(" ");
                }
                catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                    e.printStackTrace();
                }

                int n = inputParts.length;
                ArrayList<Integer> ints = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ints.add(Integer.valueOf(inputParts[i]));
                }
                return ints;
            }
        }

        Io io = new Io();
        ArrayList<Integer> ints = io.inputInts();
        int N = ints.get(0), M = ints.get(1);
        HashMap<Integer, ArrayList<Integer>> prefs = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> cities = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            prefs.put(i, new ArrayList<Integer>());
        }

        for (int i = 1; i <= M; i++) {
            ints = io.inputInts();
            int p = ints.get(0), y = ints.get(1);
            prefs.get(p).add(i);
            ArrayList<Integer> attrs = new ArrayList<>(3);
            attrs.add(p);
            attrs.add(y);
            cities.put(i, attrs);
        }

        for (int i = 1; i <= N; i++) {
            if (prefs.get(i).size() > 1) {
                prefs.get(i).sort((Integer city_a, Integer city_b) -> cities.get(city_a).get(1) - cities.get(city_b).get(1));
            }
        }

        for (int i = 1; i <= N; i++) {
            int size = prefs.get(i).size();
            for (int j = 0; j < size; j++) {
                cities.get(prefs.get(i).get(j)).add(j + 1);
            }
        }

        for (int i = 1; i <= M; i++) {
            ArrayList<Integer> city = cities.get(i);
            System.out.println(getId(city.get(0), city.get(2)));
        }
    }
}
