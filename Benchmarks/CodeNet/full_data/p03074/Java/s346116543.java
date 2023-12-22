import java.util.*;
class Group {
    char color;
    int cnt;
    public Group(char color, int cnt){
	this.color = color;
	this.cnt = cnt;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());
	String str = sc.next();
	if(N<=K) {
	    System.out.println(N);
	    return;
	}
	Group[] groups = new Group[N];
	int gcnt = 0;
	for(int i = 0; i<N; i++) {
	    char cur = str.charAt(i);
	    if(i==0) {
		groups[0] = new Group(cur, 1);
		continue;
	    }
	    if(cur == groups[gcnt].color) {
		groups[gcnt].cnt++;
	    }else {
		gcnt++;
		groups[gcnt] = new Group(cur, 1);
	    }
	}
	/*
	for(int i = 0; i<=gcnt; i++) {
	    System.out.print(groups[i].cnt +" ");
	}
	*/
	int max = 0;
	for(int i = 0; i<=gcnt; i++) {
	    // update i
	    int cnt0 = 0;
	    int tmp = 0;
	    int nextI = i;
	    while(cnt0<K && i<=gcnt) {
		tmp += groups[i].cnt;
		if(groups[i].color=='0')cnt0++;
		i++;
	    }
	    if(i<=gcnt) {
		tmp+=groups[i].cnt;
		i--;
	    }
	    i = nextI;
	    //	    System.out.println(tmp);
	    max = Math.max(tmp,max);
	}
	System.out.println(max);
    }
}