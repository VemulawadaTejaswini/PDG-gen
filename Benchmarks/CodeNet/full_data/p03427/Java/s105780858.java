import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int nHole=0;
		ArrayList<Integer> x= new ArrayList<Integer>();
		ArrayList<Integer> y= new ArrayList<Integer>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			nHole = Integer.parseInt(br.readLine());
			for(int i=0;i<nHole;i++) {
				String[] lsLine = br.readLine().split(" ");
                x.add(Integer.parseInt(lsLine[0]));
                y.add(Integer.parseInt(lsLine[1]));
			}
		}
		//x.stream().forEach(e->System.out.println(e));
		//y.stream().forEach(e->System.out.println(e));
		int numTry = 1000000;
		int maxX = x.stream().max((a, b) -> a.compareTo(b)).get();
		int maxY = y.stream().max((a, b) -> a.compareTo(b)).get();
		int minX = x.stream().min((a, b) -> a.compareTo(b)).get();
		int minY = y.stream().min((a, b) -> a.compareTo(b)).get();
		double[] count = new double[nHole];
		for(int n=0;n<numTry;n++) {
			double tryX = minX + (maxX-minX)*Math.random();
			double tryY = minY + (maxY-minY)*Math.random();
			double distance =100000000.0;
			int closest =0;
			for(int i=0; i<nHole; i++) {
				double calcD = Math.sqrt(Math.pow(tryX-x.get(i), 2) + Math.pow(tryY-y.get(i), 2));
				if(distance > calcD) {
					distance =calcD;
					closest = i;
				}
			}
			count[closest]++;
		}
		Arrays.stream(count).forEach(c -> System.out.println(c/((double)numTry)));
	}

}