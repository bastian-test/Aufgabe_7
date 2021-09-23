

public class Main {

	public static void main(String[] args) {
		// Die main Methode des Githubs Programms
		//Aufgabe 7 
		Wohnung[] wohnblock = new Wohnung[3] ;
		wohnblock[0] = new Wohnung(80.4, 10.2);
		wohnblock[1] = new Wohnung(100.3, 12.2);
		wohnblock[2] = new Wohnung(120.8, 30.8);
		
		int i = 1;
		for(Wohnung Hausnummer:wohnblock)
		{
			System.out.printf("Wohnung %d Flaeche: %4.1f qm und einen %3.1f qm grossen Balkon. %n", i, Hausnummer.getFlaecheInnen(), 
					Hausnummer.getFlaecheBalkon());
			i++;
					
		}
		
		Wohnung Wohnkopie;
		Wohnkopie = wohnblock[0];
		System.out.printf("Die Daten der Wohnkopie:%n");
		Wohnkopie.WerteAusgabe();
		System.out.printf("Die Daten der Originalwohnung%n");
		wohnblock[0].WerteAusgabe();
		System.out.printf("Jetzt werden die werte der Kopie geaendert%n");
		Wohnkopie.setFlaecheBalkon(99.9);
		Wohnkopie.setFlaecheInnen(99.9);
		System.out.printf("Die Daten der Wohnkopie:%n");
		Wohnkopie.WerteAusgabe();
		System.out.printf("Die Daten der Originalwohnung%n");
		wohnblock[0].WerteAusgabe();
		
		Wohnkopie.getGesammt();
		
		
	}

}
