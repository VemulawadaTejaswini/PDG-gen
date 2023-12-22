import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    char[] sChar = s.toCharArray();
    Map<Character, Alphabet> map = new HashMap<>();

    // Map生成
    for (int i = 0; i < sChar.length ; i++) {
      Alphabet a = map.get(sChar[i]);
      if (a == null) {
        map.put(sChar[i], new Alphabet(sChar[i], i));
      } else {
        a.addIndex(i);
      }
    }

    char[] tChar = t.toCharArray();

    int position = -1;
    long count = 0;
    int sCharLength = sChar.length;

    for(int i = 0; i < tChar.length ; i++){
      // System.out.print("index: i " + i + ", Alphabet:" + tChar[i] + ", Count:" + count);
      Alphabet a = map.get(tChar[i]) ;
      if(a == null){
        count = -1;
        break;
      }
      // System.out.print(",position" + position);
      int nextIndex = a.nextIndex(position);
      // System.out.println(", nextIndex"+ nextIndex);
      if(nextIndex <= position){
        count += (sCharLength - position) + nextIndex;
      } else {
        count += nextIndex - position;
      }
      position = nextIndex;
    }

    System.out.println(count);
  }

  public static class Alphabet {
    char alphabet;
    TreeSet<Integer> a = new TreeSet<Integer>();
    public Alphabet (char c, int index){
      this.alphabet = c;
      a.add(index);
    }

    public void addIndex (int index){
      a.add(index);
    }

    public int nextIndex(int index){
      Integer nextIndex = a.higher(index);
      if(nextIndex == null){
        return a.first();
      } else  {
        return nextIndex;
      }
    }
  }
}
