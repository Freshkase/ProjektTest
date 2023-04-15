package mitComparable;

public class Student {
	private String name;
	private String vorname;
	private String studium;
	private Integer matnr;
	public Student(String name, String vorname, String studium, Integer matnr) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.studium = studium;
		this.matnr = matnr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", vorname=" + vorname + ", studium=" + studium + ", matnr=" + matnr + "]";
	}
	
}
