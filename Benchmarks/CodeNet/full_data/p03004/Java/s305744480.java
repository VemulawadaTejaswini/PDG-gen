import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);

		long udxmax= Long.MIN_VALUE,udxmin= Long.MAX_VALUE,rxmax= Long.MIN_VALUE,rxmin= Long.MAX_VALUE,lxmax= Long.MIN_VALUE,lxmin= Long.MAX_VALUE;
		long uymax= Long.MIN_VALUE,uymin= Long.MAX_VALUE,dymax= Long.MIN_VALUE,dymin= Long.MAX_VALUE,rlymax= Long.MIN_VALUE,rlymin= Long.MAX_VALUE;
		for ( int i = 0 ; i < n ; i++) {
			s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[0]);
			switch ( s[2] ) {
			case "U":
				if ( udxmax < x ) udxmax = x; 
				if ( udxmin > x ) udxmin = x; 
				if ( uymax < y ) uymax = y; 
				if ( uymin > y ) uymin = y; 
				break;
			case "D":
				if ( udxmax < x ) udxmax = x; 
				if ( udxmin > x ) udxmin = x; 
				if ( dymax < y ) dymax = y; 
				if ( dymin > y ) dymin = y; 
				break;
			case "R":
				if ( rxmax < x ) rxmax = x; 
				if ( rxmin > x ) rxmin = x; 
				if ( rlymax < y ) rlymax = y; 
				if ( rlymin > y ) rlymin = y; 
				break;
			case "L":
				if ( lxmax < x ) lxmax = x; 
				if ( lxmin > x ) lxmin = x; 
				if ( rlymax < y ) rlymax = y; 
				if ( rlymin > y ) rlymin = y; 
				break;
			}
		}

		long min = Long.MAX_VALUE;
		long ans;
		long w = Long.MAX_VALUE -1L;
		long h = Long.MAX_VALUE -1L;
		for (;;) {
			long xmax=udxmax;
			long xmin=udxmin;
			long ymax=rlymax;
			long ymin=rlymin;
			if (xmax<rxmax) xmax=rxmax;
			if (xmax<lxmax) xmax=lxmax;
			if (xmin>rxmin) xmin=rxmin;
			if (xmin>lxmin) xmin=lxmin;
			if (ymax<uymax) ymax=uymax;
			if (ymax<dymax) ymax=dymax;
			if (ymin>uymin) ymin=uymin;
			if (ymin>dymin) ymin=dymin;
			if ( xmax - xmin > w+1L && ymax - ymin > h+1L ) {
				break;
			}
			w = xmax - xmin;
			h = ymax - ymin;
			ans = (xmax-xmin)*(ymax-ymin);
			if ( min > ans) min=ans;
			rxmax++;
			rxmin++;
			--lxmax;
			--lxmin;
			uymax++;
			uymin++;
			--dymax;
			--dymin;
		}
		System.out.println(min);
	}
}
