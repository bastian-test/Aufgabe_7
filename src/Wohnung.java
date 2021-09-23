
public class Wohnung {

	private double flaecheInnen;
	private double flaecheBalkon;
	
	public double getFlaecheInnen() {
		return flaecheInnen;
	}
	public void setFlaecheInnen(double flaecheInnen) {
		this.flaecheInnen = flaecheInnen;
	}
	public double getFlaecheBalkon() {
		return flaecheBalkon;
	}
	public void setFlaecheBalkon(double flaecheBalkon) {
		this.flaecheBalkon = flaecheBalkon;
	}
	
	public Wohnung()
	{
		 this(100.0, 10.0);
	}
	
	public Wohnung(double FlaecheInnen)
	{
		this.setFlaecheInnen(FlaecheInnen);
	}
	
	public Wohnung(double FlaecheInnen, double FlaecheBalkon)
	{
		this(FlaecheInnen);
		this.setFlaecheBalkon(FlaecheBalkon);
	}
	
	public void WerteAusgabe()
	{
		System.out.printf("Flaeche: %4.1f qm und einen %3.1f qm grossen Balkon. %n", getFlaecheInnen(), 
				getFlaecheBalkon());
	}
	
	public void getGesammt()
	{
		System.out.printf("Die Gesammt qm-Zahl betraegt: %f qm%n", this.getFlaecheBalkon()+this.getFlaecheInnen());
	}
}
