import java.util.Scanner;

public class Main {
    static String a[];
    static String n;

  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  n = sc.next();
	  a = new String[n.length()];
	  for(int i = 0; i < n.length(); i++) {
		  a[i] = n.substring(i, i+1);
	  }
      System.out.println(dfs(0,a[0]));
      sc.close();
  }
  static public long dfs(int i,String sum) {
	//基本ケース　枝の最後の基本ケース
    if (i == n.length()-1) {
    		long tmp = 0;
    		String[] siki = sum.split(",");
    		for(int j = 0; j < siki.length; j++) {
    			tmp += Long.parseLong(siki[j]);
    		}
    	return tmp;
    }

    //再帰ケース
    long X = dfs(i + 1,sum + a[i+1]);
    long Y = dfs(i + 1,sum + "," + a[i+1]);

    return X+Y;
  }
}