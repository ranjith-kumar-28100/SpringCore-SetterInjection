package inc.codeman.spring.springcore.reftypes;

public class Scores {
	private Double maths;
	private Double science;
	private Double social;

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getScience() {
		return science;
	}

	public void setScience(Double science) {
		this.science = science;
	}

	public Double getSocial() {
		return social;
	}

	public void setSocial(Double social) {
		this.social = social;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", science=" + science + ", social=" + social + "]";
	}

}
