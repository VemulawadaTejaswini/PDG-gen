
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		long w = scan.nextLong();
		long answer;

		if(h%3==0 || w%3==0){
			answer = 0;
		}else{
			ArrayList<Long> list = new ArrayList<>();
			long x = h * w / 3;
			long i = x / h;
			long temp, max, min;

			if(h % 2 == 0){
				temp = Math.abs(h*i - h/2*(w-i));
				list.add(temp);
				i++;
				temp = Math.abs(h*i - h/2*(w-i));
				list.add(temp);
				i++;
				temp = Math.abs(h*i - h/2*(w-i));
				list.add(temp);
			}else{
				max = Math.max(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				max = Math.max(max, h*i);
				min = Math.min(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				min = Math.min(min, h*i);
				temp = max - min;
				list.add(temp);
				i++;
				max = Math.max(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				max = Math.max(max, h*i);
				min = Math.min(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				min = Math.min(min, h*i);
				temp = max - min;
				list.add(temp);
				i++;
				max = Math.max(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				max = Math.max(max, h*i);
				min = Math.min(Math.abs(h/2*(w-i)), Math.abs((h/2+1)*(w-i)));
				min = Math.min(min, h*i);
				temp = max - min;
				list.add(temp);
			}

			i = x / w;

			if(w % 2 == 0){
				temp = Math.abs(w*i - w/2*(h-i));
				list.add(temp);
				i++;
				temp = Math.abs(w*i - w/2*(h-i));
				list.add(temp);
				i++;
				temp = Math.abs(w*i - w/2*(h-i));
				list.add(temp);
			}else{
				max = Math.max(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				max = Math.max(max, w*i);
				min = Math.min(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				min = Math.min(min, w*i);
				temp = max - min;
				list.add(temp);
				i++;
				max = Math.max(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				max = Math.max(max, w*i);
				min = Math.min(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				min = Math.min(min, w*i);
				temp = max - min;
				list.add(temp);
				i++;
				max = Math.max(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				max = Math.max(max, w*i);
				min = Math.min(Math.abs(w/2*(h-i)), Math.abs((w/2+1)*(h-i)));
				min = Math.min(min, w*i);
				temp = max - min;
				list.add(temp);
			}

			Collections.sort(list);
			answer = list.get(0);
		}

		System.out.println(answer);
	}


}
