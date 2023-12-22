import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter outWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String finalOutput = "";
		String line;
		int count = 0;
		int sum = 0;
		line = inReader.readLine();
		char[] tmp = line.toCharArray();
		
		finalOutput += tmp[0];
		finalOutput += tmp[1];

		finalOutput += tmp[2];
		finalOutput += tmp[3];

		finalOutput += " ";
		for(int i = 4; i < tmp.length; i ++)
			finalOutput += tmp[i];
		System.out.println(finalOutput);
}
}