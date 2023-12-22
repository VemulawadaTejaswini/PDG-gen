import java.util.*;
class Kukan
{
  public int L;
  public int R;
  
  Kukan(){}
  Kukan(String str)
  {
    String[] strs = str.split(" ");
    L = Integer.parseInt(strs[0]);
    R = Integer.parseInt(strs[1]);
  }
}

class Main 
{
	static Scanner scan = new Scanner(System.in);
	static int N;
	static int M;
	static int Q;
    static List<Kukan> trains = new ArrayList<>();
    static List<Kukan> takahashi = new ArrayList<>();
  
  private static void initScan()
  {
    String line = scan.nextLine();
    String[] strs = line.split(" ");
    
    N = Integer.parseInt(strs[0]);
    M = Integer.parseInt(strs[1]);
    Q = Integer.parseInt(strs[2]);
    
    for(int i = 0; i < M; i++){trains.add(new Kukan(scan.nextLine()));}
    for(int i = 0; i < Q; i++){takahashi.add(new Kukan(scan.nextLine()));}
    
  }
  
  public static void main(String[] args){
    initScan();
    
    for(int situmon = 0; situmon < Q; situmon++)
    {
      int ans = 0;
      Kukan que = takahashi.get(situmon);
      for(Kukan hoyuu : trains)
      {
        if(que.L <= hoyuu.L && hoyuu.R <= que.R){ans++;}
      }
    System.out.println(ans);
    }
    
  }
}
