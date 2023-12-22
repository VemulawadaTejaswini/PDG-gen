import java.util.*;

//update 2019/12/13

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int n = nextInt();  int k = nextInt();
    int r = nextInt();  int s = nextInt();  int p = nextInt();
    String t = next();

    long ans = 0;

    String[] machine = splitString(t);

    //理想の手
    String[] ideal = win(machine);

    for(int i=0;i<k;i++){
      if(ideal[i].equals("p")){
        ans += p;
      }
      else if(ideal[i].equals("r")){
        ans += r;
      }
      else if(ideal[i].equals("s")){
        ans += s;
      }
    }

    //制限の調整
    for(int i=k;i<n;i++){
      int mae = i-k;
      if(ideal[mae].equals(ideal[i])){ //k回前と同じなら
        //書き換えないと後に響く
          ideal[i] = "-";
      }
      else{ //k回前と同じでないなら、
        if(ideal[i].equals("p")){
          ans += p;
        }
        else if(ideal[i].equals("r")){
          ans += r;
        }
        else if(ideal[i].equals("s")){
          ans += s;
        }
      }
    }

    System.out.println(ans);


/*
    for(int i=0;i<n;i++){
      System.out.println("machine["+i+"]="+machine[i]);
    }
    for(int i=0;i<n;i++){
      System.out.println("real["+i+"]="+ideal[i]);
    }
*/

  }

  static String[] win(String[] machine){
    int lng = machine.length;
    String[] ideal = new String[lng];
    for(int i=0;i<lng;i++){
      if(machine[i].equals("r")){
        ideal[i] = "p";
      }
      else if(machine[i].equals("s")){
        ideal[i] = "r";
      }
      else if(machine[i].equals("p")){
        ideal[i] = "s";
      }
    }
    return ideal;
  }


  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
  }

  static char[] splitChar(String s){
    return s.toCharArray();
  }

  static int charToInt(char aaa){
    return aaa - 48;
  }

  public static int maxInt(int[] a,int lng){
    int max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static int minInt(int[] a,int lng){
    int min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

  public static long maxLong(long[] a,int lng){
    long max=a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }

  public static long minLong(long[] a,int lng){
    long min=a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }

}
