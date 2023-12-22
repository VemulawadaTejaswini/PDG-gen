public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monsterNum = sc.nextInt();
		int ultimate = sc.nextInt();
		List<Integer> monsterList = new ArrayList<>();
		for(int i = 0;i < monsterNum; i++ ) {
			monsterList.add(sc.nextInt());
		}

		monsterList.sort((x,y) -> y.compareTo(x));

		int anser = monsterList.stream()
		.skip(ultimate)
		.peek(x -> System.out.println(x))
		.mapToInt(x -> x)
		.peek(x -> System.out.println(x))
		.sum();
		System.out.println(anser);
