import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	public static void main(String ar[]) throws ParseException {
		Player p1 = new Player(10, "Virat", new SimpleDateFormat("dd/MM/YYYY").parse("02/11/1988"), 52.10);
		Player p2 = new Player(2, "Rohit", new SimpleDateFormat("dd/MM/YYYY").parse("02/12/1987"), 45.10);
		Player p3 = new Player(3, "Shikhar", new SimpleDateFormat("dd/MM/YYYY").parse("04/10/1986"), 42.10);
		List<Player> list = new ArrayList<Player>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		//instantiate the comparator class
		TestComparator comp = new TestComparator();
		//pass it on to the sort method (note that sort method can only be invoked on
		//a collection of objects in which the object implements either the comparable or comparator interface
		//https://docs.oracle.com/javase/9/docs/api/java/util/Collections.html#sort-java.util.List)
		Collections.sort(list,comp);
		for (Player pl : list) {
			System.out.println(pl.getName());
		}
	}

}
