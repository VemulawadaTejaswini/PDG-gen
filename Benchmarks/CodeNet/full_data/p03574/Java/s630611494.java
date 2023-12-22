import java.util.Scanner;

public class Main
{
    int dx[] = {0, 0, 1, 1, 1, -1, -1, -1};
    int dy[] = {1, -1, 1, 0, -1, 1, 0, -1};
    int h, w;
    int mp[][];
    String s[][];
    
    public static void main(String args[])
    {
	new Main().run();
    }

    void run()
    {
	in();
	
	for(int i = 0; i < h; i++) {
	    for(int j = 0; j < w; j++) {
		
		if(s[i][j].equals(".")) continue;
		for(int k = 0; k < 8; k++) {
		    int mx = j + dx[k];
		    int my = i + dy[k];
		    if(mx < 0 || w <= mx || my < 0 || h <= my) continue;
		    mp[my][mx]++;
		}
		
	    }
	}
	
	out();
    }

    void in()
    {
	Scanner sc = new Scanner(System.in);

	h = sc.nextInt();
	w = sc.nextInt();
	mp = new int[51][51];
	s  = new String[51][51];

	for(int i = 0; i < h; i++) {
	    String line = sc.next();
	    for (int j = 0; j < w; j++)
		s[i][j] = String.valueOf(line.charAt(j));
	}
    }

    void out()
    {
	for(int i = 0; i < h; i++) {
	    for(int j = 0; j < w; j++) {
		if(s[i][j].equals("."))
		    System.out.print(mp[i][j]);
		else
		    System.out.print('#');
	    }
	    
	    System.out.println();
	}
    }
}
