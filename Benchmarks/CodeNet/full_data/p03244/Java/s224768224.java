	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Scanner;

	public class Main {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			ArrayList<Integer> evenNumList = new ArrayList<>();
			ArrayList<Integer> oddNumList = new ArrayList<>();
			HashMap<String, Integer> evenNumCntMap = new HashMap<>();
			HashMap<String, Integer> oddNumCntMap = new HashMap<>();
			int evenNum = 0;
			int oddNum = 0;

			int len = sc.nextInt();
			int result = 0;

			for (int i = 0; i < len; i++) {

				if (i==0 || i % 2 == 0) {
					hogehoge(sc.nextInt(), evenNumList, evenNumCntMap);

				} else {
					hogehoge(sc.nextInt(), oddNumList, oddNumCntMap);
				}
			}
	      
	        if (evenNumList.size() == 1
	             && oddNumList.size() == 1
	             && evenNumList.get(0) == oddNumList.get(0)) {
	            result = len / 2;
	        } else {
	        	int evenResult = 0;
	        	int oddResult = 0;

		    	if (evenNumList.size() != 1) {
			        evenResult = getResult(evenNumList, evenNumCntMap, evenNum, len);
			    }

			    if (oddNumList.size() != 1) {
				    oddResult = getResult(oddNumList, oddNumCntMap, oddNum, len);
			    }
			    
			    if (evenNum == oddNum) {
			    	if (evenResult == oddResult) {
			    		result = (len - evenResult - oddResult) / 2;

			    	} else {
			    		if (evenResult > oddResult) {
				    		evenResult = (len / 2) - evenResult;
				    		
				   		} else if (evenResult < oddResult) {
				   			oddResult = (len / 2) - oddResult;
				    	}
				    	result = evenResult + oddResult;
				    }
			    }
	        }

			System.out.println(result);
			sc.close();
		}

		public static void hogehoge(int num, ArrayList<Integer> list, HashMap<String,Integer> map) {

			String str = Integer.toString(num);

			if (list.contains(num)) {
				int cnt = map.get(str) + 1;
				map.put(str, cnt);

			} else {
				list.add(num);
				map.put(str, (int) 1);
			}
		}

		public static int getResult(ArrayList<Integer> list, HashMap<String,Integer> map, int num, int len) {

			int tmpCnt = 0;
			int tmpNum = len / 2;
	        int totalCnt = 0;

			for (int _num : list) {

				int cnt = map.get(Integer.toString(_num));

				if (cnt > tmpNum / 2) {
					num = _num;
					return tmpNum - cnt;

				} else {

					if (tmpCnt < cnt) {
						tmpCnt = cnt;
	                    totalCnt += cnt;
	                    num = _num;
	                  
	                    if (totalCnt > tmpNum / 2) {
	                        return tmpNum - tmpCnt;
	                    }
					}
				}
			}
			return tmpNum - tmpCnt;
		}
	}
