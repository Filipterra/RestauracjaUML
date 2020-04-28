
public class TestMain {

	
	
	
	public static void main(String[] args) {
	
	Bazauzytkownikow bdu=new Bazauzytkownikow();
	Bazazamowien bdz=new Bazazamowien();
	Bazarabatow bdr=new Bazarabatow();
	Bazapromocji bzp=new Bazapromocji();
	Systemuwierzytelniania system=new Systemuwierzytelniania(bdu);
	Interfejskelnera interfejs=new Interfejskelnera(system, bdz, null, bdr, bzp);
	
	bdu.Test();
	
	Integer nrZamowienia = interfejs.Dodajzamowienie();
	System.out.print("\n");
	interfejs.Wyswietlzamowienia(nrZamowienia);
	}

}
