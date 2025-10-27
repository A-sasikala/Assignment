package Assignment1.employees;

public class Developer extends Employee {
	
	private String primarylanguage;
	private String githubid;
	
	
	public Developer(String employeeName, String id, double monthlyPay, String primarylanguage, String githubid) {
		super(employeeName, id, monthlyPay);
		this.primarylanguage = primarylanguage;
		this.githubid = githubid;
	}


	public String getPrimarylanguage() {
		return primarylanguage;
	}


	public void setPrimarylanguage(String primarylanguage) {
		this.primarylanguage = primarylanguage;
	}


	public String getGithubid() {
		return githubid;
	}


	public void setGithubid(String githubid) {
		this.githubid = githubid;
	}


	@Override
	public String toString() {
		return "Developer [primarylanguage=" + primarylanguage + ", githubid=" + githubid + "]";
}

}