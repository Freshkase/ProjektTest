package mitCollections;

public class Student implements Comparable<Student> {
	private String nachname;
	private String vorname;
	public int getMatNr() {
		return matNr;
	}
	private String studiengang;
	private int matNr;
	public Student(String nachname, String vorname, String studiengang, int matNr) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.studiengang = studiengang;
		this.matNr = matNr;
	}
	@Override
	public String toString() {
		return "Student [nachname=" + nachname + ", vorname=" + vorname + ", studiengang=" + studiengang + ", matNr="
				+ matNr + "]";
	}
	@Override
	public int compareTo(Student student) {
		return this.nachname.compareTo(student.nachname);
	}
	
	
}
