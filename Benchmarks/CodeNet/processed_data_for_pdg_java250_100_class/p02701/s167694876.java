public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        List<String> s = new ArrayList<>();
        int cnt = 0;
		Set<String> checkHash = new HashSet<String>();
        while (sn.hasNext()) {
            s.add(sn.nextLine());
        }
        for(String str : s) {
            if(checkHash.contains(str)) {
				cnt++;
			} else {
				checkHash.add(str);
			}
        }
        System.out.print(n - cnt);
    }
}
