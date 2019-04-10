import java.util.Date;

/**
 * 
 */

/**
 * @author ez003385
 *
 */
public class Player implements Comparable<Player> {

	private int rank;
	private String name;
	private Date dob;
	private double avg;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public Player(int rank, String name, Date dob, double avg) {
		super();
		this.rank = rank;
		this.name = name;
		this.dob = dob;
		this.avg = avg;
	}
	
	//default ordering based on rank, defined in the same class in contrast to a comparator
	//where the comparator is defined in its own class
	@Override
	public int compareTo(Player o) {
		//for primitive types we can use the subtraction operator, but for object types we
		//have to use compareTo() method which is present in every object type
		return this.rank - o.rank;
	}
	
	
}
