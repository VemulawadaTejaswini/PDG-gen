import java.util.stream.*;

class Main{
	public static void main(String[] A){
		System.out.println(
				IntStream.range(2,11110).map(i->i*5+1)
						.filter(o->IntStream.range(2,o).noneMatch(p->o%p==0))
						.limit(new java.util.Scanner(System.in).nextInt())
						.mapToObj(String::valueOf)
						.collect(Collectors.joining(" "))
						);
	}
}
