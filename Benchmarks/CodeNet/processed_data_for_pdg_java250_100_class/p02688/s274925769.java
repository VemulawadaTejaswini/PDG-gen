public class Main {
    public static void main(String args[]) {
        Scanner scan = null;
        List<String> scanList = new ArrayList<String>();
        try {
            scan = new Scanner(System.in);
            while(scan.hasNext()){
                String str = scan.nextLine();
                scanList.add(str);
            }
        } finally {
            scan.close();
        }
        String strN = null;
        List<Integer> nList = new ArrayList<Integer>();
        int i = 0;
        for(String str : scanList) {
            if(i == 0) {
                strN = str.substring(0, str.indexOf(" "));
                for(int k=0; k<Integer.valueOf(strN); k++) {
                    nList.add(k+1);
                }
            } else if (i != 0 && 0 == i % 2) {
                String[] sList = str.split(" ");
                for(int j=0; j<sList.length; j++) {
                    int targetInt = Integer.valueOf(sList[j]);
                    if(nList.contains(targetInt)) {
                        nList.remove(nList.indexOf(targetInt));
                    }
                }
            }
            i++;
        }
        System.out.println(nList.size());
    }
}
