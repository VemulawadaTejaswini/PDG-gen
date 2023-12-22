import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s1 = r.readLine();
		long num = Long.valueOf(s1.split(" ")[0]);
		long count = Long.valueOf(s1.split(" ")[1]);
		double val = 0.0d;

		double kitei = ((double)1 / num);
		for (long i = 1; i <= num; i++) {
			if (i >= count) {
				val += kitei;
				continue;
			}
			
			double v = 1;
			long v2 = i;
			for (long j = 0; j < count; j++) {
				v2 = v2 * 2;
				v = v / 2;
				if (v2 >= count) {
					val += kitei * v;
					break;
				}
			}
		}
		
		System.out.println(val);
	}
}
