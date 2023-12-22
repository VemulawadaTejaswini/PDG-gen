import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter outWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String finalOutput = "";
		String line;
		int noPair = 0;
		int count = 0;
		int sum = 0;
		HashMap<Integer, ArrayList<Integer>> mMap = new HashMap<>();
		finalOutput += " ";

		while ((line = inReader.readLine()) != null) {
			if (line.trim().compareTo("") == 0 || line == null || count == 3)
				break;

			switch (count) {
			case 0:
				// noPair = Integer.parseInt(line.trim());
				break;
			case 1:
				String[] tmp = line.split(" ");
				for (int i = 1; i <= tmp.length; i++) {
					ArrayList<Integer> tmpList = null;
					tmpList = mMap.get(Integer.parseInt(tmp[i - 1].trim()));
					if (tmpList == null) {
						tmpList = new ArrayList<>();
					}
					tmpList.add(i);
					mMap.put(Integer.parseInt(tmp[i - 1].trim()), tmpList);
				}

				break;
			}

			if (count == 1)
				break;
			++count;
		}
		noPair = 0;

		for (Entry<Integer, ArrayList<Integer>> e : mMap.entrySet()) {
			for (Integer i : e.getValue()) {
				if (mMap.get(i) != null && mMap.get(i).contains(e.getKey()))
					noPair++;
			}
		}
		noPair = noPair / 2;
		// outWriter.write("" + finalOutput);
		System.out.println(noPair + "");
		inReader.close();
		outWriter.close();

	}

}
