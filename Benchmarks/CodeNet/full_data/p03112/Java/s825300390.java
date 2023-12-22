import java.util.AbstractMap.SimpleEntry;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> header = Arrays.stream(sc.nextLine().split(" ")).map(Long::valueOf)
				.collect(Collectors.toList());

		List<Tatemono> jinjaAndTera = new ArrayList<>();
		new ArrayList<>();
		new ArrayList<>();
		List<Tatemono> mondai = new ArrayList<>();

		List<Tatemono> jinja = read(sc, header.get(0), jinjaAndTera, "jinja");
		List<Tatemono> tera = read(sc, header.get(1), jinjaAndTera, "tera");
		read(sc, header.get(2), mondai, "x");

		// 神社と寺の間の最短距離Map
		Map<Tatemono, Long> map = new HashMap<>();
		jinjaAndTera.sort(null);
		jinja.sort(null);
		tera.sort(null);

		long iJinja = 0;
		long iTera = 0;
		for (Tatemono tatemono : jinjaAndTera) {
			if ("tera".equals(tatemono.name)) {
				map.put(tatemono, getMinDistance(tatemono, iJinja, jinja));
				iTera++;
				if (tera.size() == iTera) {
					iTera--;
				}
			} else if ("jinja".equals(tatemono.name)) {
				map.put(tatemono, getMinDistance(tatemono, iTera, tera));
				iJinja++;
				if (jinja.size() == iJinja) {
					iJinja--;
				}
			}
		}

		// やっと答えにたどり着いたのか・・・
		for (Tatemono xObj : mondai) {
			SimpleEntry<Tatemono, Tatemono> pair = findNearestTatemono(jinjaAndTera, jinjaAndTera.size() / 2, xObj);

			Tatemono left = pair.getKey();
			Tatemono right = pair.getValue();

			long leftDistance = Math.abs(map.get(left)) + Math.abs(xObj.pos - left.pos);
			long rightDistance = Math.abs(map.get(right)) + Math.abs(xObj.pos - right.pos);

			System.out.println(Long.min(leftDistance, rightDistance));
		}

	}

	public static SimpleEntry<Tatemono, Tatemono> findNearestTatemono(List<Tatemono> jinjaAndTera, long index,
			Tatemono target) {
		SimpleEntry<Tatemono, Tatemono> nearestTatemonoPair = null;

		if (index + 1 < jinjaAndTera.size() && index != 0) {
			Tatemono tempThis = jinjaAndTera.get((int)index);
			Tatemono tempAfter = jinjaAndTera.get((int)index + 1);

			if (tempThis.pos < target.pos && target.pos < tempAfter.pos) {
				nearestTatemonoPair = new SimpleEntry<>(tempThis, tempAfter);
			} else {
				if (target.pos < tempThis.pos) {
					long nextIndex = index - index / 2;
					if (nextIndex == index) {
						nextIndex--;
					}
					nearestTatemonoPair = findNearestTatemono(jinjaAndTera, nextIndex, target);
				} else {
					long nextIndex = index + (jinjaAndTera.size() - index) / 2;
					if (nextIndex == index) {
						nextIndex++;
					}
					nearestTatemonoPair = findNearestTatemono(jinjaAndTera, nextIndex, target);
				}
			}
		} else if (index == 0) {
			nearestTatemonoPair = new SimpleEntry<>(jinjaAndTera.get(0), jinjaAndTera.get(0));
		} else {
			nearestTatemonoPair = new SimpleEntry<>(jinjaAndTera.get(jinjaAndTera.size() - 1),
					jinjaAndTera.get(jinjaAndTera.size() - 1));
		}
		return nearestTatemonoPair;
	}

	public static long getMinDistance(Tatemono tatemono, long i, List<Tatemono> list) {
		Tatemono before;
		Tatemono now;
		Tatemono after;
		long tatemonoPos = tatemono.pos;
		long beforePos = Long.MAX_VALUE;
		long nowPos = Long.MAX_VALUE;
		long afterPos = Long.MAX_VALUE;
		if (i != 0) {
			before = list.get((int)i - 1);
			beforePos = before.pos;
		}
		now = list.get((int)i);
		nowPos = now.pos;
		if (i != list.size() - 1) {
			after = list.get((int)i + 1);
			afterPos = after.pos;
		}

		long minDistance = Long.min(Math.abs(tatemonoPos - nowPos),
				(Long.min(Math.abs(tatemonoPos - beforePos), Math.abs(tatemonoPos - afterPos))));
		return minDistance;
	}

	public static class Tatemono implements Comparable<Tatemono> {
		public String name;
		public long pos;

		public Tatemono(String name, long pos) {
			this.name = name;
			this.pos = pos;
		}

		@Override
		public int compareTo(Tatemono o2) {
			return Long.valueOf(this.pos).compareTo(Long.valueOf(o2.pos));
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + (int) (pos ^ (pos >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tatemono other = (Tatemono) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (pos != other.pos)
				return false;
			return true;
		}
		
	}

	public static List<Tatemono> read(Scanner sc, long length, Collection<Tatemono> list, String name) {
		List<Tatemono> inputList = new ArrayList<>();
		for (long i = 0; i < length; i++) {
			Tatemono tatemono = new Tatemono(name, Long.valueOf(sc.nextLine()));
			list.add(tatemono);
			inputList.add(tatemono);

		}
		return inputList;
	}
}