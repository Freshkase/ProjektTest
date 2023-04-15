package mitCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Studentenvergleich {


	public static void main(String[] args) {
		/*Student studenten[] = new Student[6];
		studenten[0] = new Student("Baur", "Melanie", "INF", 42);
		studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
		studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
		studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
		studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
		studenten[5] = new Student("Mosler", "Christof", "WINF", 47);
		*/
		ArrayList<Student> studenten = new ArrayList<>();
		ausgabeStudenten(studenten);
		studenten.add(new Student("Baur", "Melanie", "INF", 42));
		studenten.add(new Student("Speiser", "Sebastian", "INF", 43));
		studenten.add(new Student("Rausch", "Alexander", "WINF", 44));
		studenten.add(new Student("Pado", "Ulrike", "WINF", 41));
		studenten.add(new Student("Knauth", "Stefan", "INF", 48));
		studenten.add(new Student("Mosler", "Christof", "WINF", 47));
		Collections.sort(studenten);
		ausgabeStudenten(studenten);
	
	}

	private static void ausgabeStudenten(ArrayList<Student> studenten) {
		for(int i=0;i< studenten.size();i++) {
			System.out.println(studenten.get(i));
		
	}

	/*private static void ausgabeStudenten(ArrayList<Student> studenten) {
		for(int i=0; i<studenten.length;i++) {
			System.out.println(studenten[i]);
		}*/
	
	}

}
