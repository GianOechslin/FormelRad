package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	
	/* Hier die Methoden mit den Formlen hinzufügen
	 */
	public double pAusRUndI(double r, double i){
		return i*i*r;
	}
	public double pAusIUndU(double i,double u){
		return i*u;
	}
	public double pAusRUndU(double r, double u){
		return u*u/r;
	}

	public double iAusPUndR(double p, double r){
		return Math.sqrt(p/r);
	}

	public double iAusRundU(double r, double u){
		return u/r;
	}

	public double iAusPUndU(double p, double u){
		return p/u;
	}

	public double uAusRUndI(double r, double i) {
		return r*i;
	}

	public double uAusPUndI(double p, double i) {
		return p/i;
	}

	public double uAusPUndR(double p, double r) {
		return Math.sqrt(p*r);
	}
}
