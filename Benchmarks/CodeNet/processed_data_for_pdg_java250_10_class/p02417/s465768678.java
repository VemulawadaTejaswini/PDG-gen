public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> alphamap = new HashMap<Character, Integer>();
        for(int i='a'; i<='z'; i++) {
            alphamap.put((char) i, 0);
        }
        String line = "";
        while ( (line = br.readLine()) != null ) {
            for (int i=0; i<line.length(); i++) {
                char c = line.charAt(i);
                c = Character.toLowerCase(c);
                if (alphamap.containsKey(c)) {
                    alphamap.replace(c, alphamap.get(c) + 1);
                }
            }
        }
        for( Character c : alphamap.keySet()) {
            System.out.println(c + " : " + alphamap.get(c));
        }
    }
}
