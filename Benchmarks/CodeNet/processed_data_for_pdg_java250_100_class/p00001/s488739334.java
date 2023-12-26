public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    while((line = reader.readLine()) != null){
      numbers.add(Integer.parseInt(line));
    }
    Collections.sort(numbers);
    for(int i = 0; i< 3; i++){
      System.out.println(numbers.get(numbers.size()-(i+1)));
    }
  }
}
