package mitComperator;

import java.util.Arrays;
import java.util.Comparator;

public class Studentenvergleich {


	public static void main(String[] args) {
		Student studenten[] = new Student[6];
		studenten[0] = new Student("Baur", "Melanie", "INF", 42);
		studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
		studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
		studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
		studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
		studenten[5] = new Student("Mosler", "Christof", "WINF", 47);
		for(int i=0; i<studenten.length;i++) {
			System.out.println(studenten[i]);
		}
		System.out.println("");
		Arrays.sort(studenten);
		for(int i=0; i<studenten.length;i++) {
			System.out.println(studenten[i]);
		}
		Comparator<Student> comparatorByMatnr = new MatrikelnummernComperator();
		Arrays.sort(studenten,comparatorByMatnr);
		System.out.println("");
		for(int i=0; i<studenten.length;i++) {
			System.out.println(studenten[i]);
		}
	
	}

}
