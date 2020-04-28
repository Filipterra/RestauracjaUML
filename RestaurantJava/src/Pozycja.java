
public class Pozycja {

	public Float Cenajednostkowa;
	public Integer Ilosc;
	private Potrawa potrawa;
	
	public Pozycja(Potrawa pot, Integer i) {
		potrawa=pot;
		Ilosc=i;
		Cenajednostkowa=potrawa.getCenasugerowana();
	}
	
	public String toString()
	{
		return potrawa + "\t" + Ilosc +"szt.\t"+(Cenajednostkowa*Ilosc)+"zl";
	}
}
