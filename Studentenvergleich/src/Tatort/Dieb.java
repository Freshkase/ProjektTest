package Tatort;

import java.util.HashSet;
import java.util.Set;

public class Dieb {

	public static void main(String[] args) {
		Set<String> personen = new HashSet<>();
		personen.add("Herr Müller");
		personen.add("Frau Müller");
		personen.add("Frrrau Maier");
		personen.add("Frau Maier");
		personen.add("Putzfrau");
		personen.add("Gärtner");
		personen.add("Elster");
		
		Set<String> alibi = new HashSet<>();
		alibi.add("Frau Müller");
		alibi.add("Gärtner");
		
		Set<String> gold = new HashSet<>();
		gold.add("Fraz Müller");
		gold.add("Herr Maier");
		gold.add("Gärtner");
		gold.add("Putzfrau");
		
		Set<String> safe = new HashSet<>();
		safe.add("Herr Müller");
		safe.add("Herr Maier");
		safe.add("Gärtner");
		safe.add("Putzfrau");
		
		Set<String> schluessel = new HashSet<>();
		schluessel.add("Her Müller");
		schluessel.add("Frau Müller");
		schluessel.add("Herr Maier");
		schluessel.add("Frau Maier");
		schluessel.add("Elster");
		
		alibi.removeAll(personen);
		gold.retainAll(schluessel);
		schluessel.retainAll(safe);
		System.out.print(schluessel);
	}

}
