package mitComparable;

import java.util.Arrays;

public class Studentenvergleich {

	public static void main(String[] args) {
        Student studenten[] = new Student[6];
        studenten[0] = new Student("Baur", "Melanie", "INF", 42);
        studenten[1] = new Student("Speiser", "Sebastian", "INF", 43);
        studenten[2] = new Student("Rausch", "Alexander", "WINF", 44);
        studenten[3] = new Student("Pado", "Ulrike", "WINF", 41);
        studenten[4] = new Student("Knauth", "Stefan", "INF", 48);
        studenten[5] = new Student("Mosler", "Christof", "WINF", 47);
        
        druckeStudenten(studenten);
        

        System.out.println("Wählen Sie ...");
        System.out.println("1 - Nachname");
        System.out.println("2 - Vorname");
        System.out.println("3 - Studiengang");
        System.out.println("4 - Matrikelnummer");
        System.out.println("X - Programmende");

	}

	private static void druckeStudenten(Student[] studenten) {
		for(int i= 0;i<studenten.length;i++) {
        	System.out.println(studenten[i]);
        }
	}

}
