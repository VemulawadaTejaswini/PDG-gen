import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int o[] = new int[c/2];
		int e[] = new int[c/2];
		for(int i=0; i<c; i++) {
			if(i%2==1) {
				o[i/2] = scan.nextInt();
			} else {
				e[i/2] = scan.nextInt();
			}
		}
		scan.close();

		Arrays.sort(o);
		Arrays.sort(e);

		HashMap om = new HashMap();
		int ov = o[0];
		int oc = 1;
		int of = ov;
		int ofc = 1;
		int os = ov;
		int osc = 1;
		HashMap em = new HashMap();
		int ev = e[0];
		int ec = 1;
		int ef = ov;
		int efc = 1;
		int es = ov;
		int esc = 1;

		for(int i=1; i<o.length; i++) {
			if(om.containsKey(o[i])) {
				oc++;
			} else {
				om.put(ov, oc);
				if(ofc <= oc) {
					os = of;
					osc = ofc;
					of = ov;
					ofc = oc;
				} else if(osc <= oc) {
					os = ov;
					osc = oc;
				}
				ov = o[i];
				oc = 1;
			}
			if(em.containsKey(e[i])) {
				ec++;
			} else {
				em.put(ev, ec);
				if(efc <= ec) {
					es = ef;
					esc = efc;
					ef = ev;
					efc = ec;
				} else if(esc <= ec) {
					es = ev;
					esc = ec;
				}
				ev = e[i];
				ec = 1;
			}
		}

		if(of == ef) {
			if(ofc > efc) {
				ef = es;
			} else {
				of = os;
			}
		}
		int rc = 0;
		for(int i=0; i<o.length; i++) {
			if(o[i] != of) {
				rc++;
			}
			if(e[i] != ef) {
				rc++;
			}
		}
		if(of == ef) {
			rc+=e.length;
		}
		System.out.println(rc);
	}
}