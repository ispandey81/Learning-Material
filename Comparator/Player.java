import java.util.Date;

/**
 * 
 */

/**
 * @author ez003385
 *
 */
public class Player {

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
	
//	@Override
//	public int compareTo(Player o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.name);
//	}
	
	
}
