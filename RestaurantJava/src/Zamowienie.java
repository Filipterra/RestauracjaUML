
/**
 * 
 */

import java.util.HashSet;
import java.util.Set;

enum StanOplaty {
	ZLOZONE, OPLACONE, ANULOWANE;
}

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Zamowienie {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer Numerzamowienia;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Float Sumarycznacenakoncowa;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String Datazamowienia;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private StanOplaty Stanoplaty;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Stolik stolik;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Kelner realizuje;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazapromocji bazapromocji;
	
	private Set<Promocja> promocja;

	private Set<Pozycja> pozycja;
	
	static Integer nextNumerZamowienia=0;
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Zastosujpromocje() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Zamowienie :: Zastosuj promocje()\n");
		
		Promocja prom = new Promocja();
		bazapromocji.Dodaj(prom);
		
		Promocja promo = bazapromocji.Wyszukaj(0);
		if(promo!=null && promo.Sprawdzwarunki()) promo.Zastosujpromocje();

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Edytujpotrawe(Potrawa pot) {
		System.out.print("Zamowienie :: Edytuj potrawe()\n");
		
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Konstruktorzamowienia() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Dodajpotrawe(Potrawa pot) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Zamowienie :: Dodaj potrawe()\n");
		
		Potrawa potr = new Potrawa(pot.toString(), pot.getCenasugerowana());
		Edytujpotrawe(potr);
		
		Pozycja pz = new Pozycja(potr, 1);
		
		pozycja.add(pz);
		Sumarycznacenakoncowa+=pz.Cenajednostkowa*pz.Ilosc;
		
		// end-user-code
	}
	
	public Zamowienie (Bazapromocji bzp, Stolik st, Kelner kl) {
		System.out.print("Zamowienie :: Konstruktor()\n");
		
		bazapromocji=bzp;
		Numerzamowienia=nextNumerZamowienia++;
		Sumarycznacenakoncowa=0f;
		Datazamowienia=null;
		Stanoplaty=StanOplaty.ZLOZONE;
		stolik = st;
		realizuje = kl;
		promocja=new HashSet<>();
		pozycja=new HashSet<>();
	}
	
	public Integer getNumerzamowienia() {
		
		return Numerzamowienia;
	}
	
	public String toString()
	{
		String str = new String("Nr. " + Numerzamowienia + "\tCena: " + Sumarycznacenakoncowa + "zl\nPozycje:\n");
		int i=1;
		for (Pozycja poz : pozycja) {
			str=str+i+" "+poz+"\n";
			++i;
		}
		return str;
	}
}