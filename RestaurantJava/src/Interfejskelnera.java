
/**
 * 
 */

import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Interfejskelnera {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Systemuwierzytelniania systemuwierzytelniania;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazarezerwacji bazarezerwacji;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazazamowien bazazamowien;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazarabatow bazarabatow;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazapromocji bazapromocji;
	
	public void Wyswietlzamowienia(Integer nrZamowienia) {
		// begin-user-code
		// TODO Auto-generated method stub
		
		Zamowienie zam = bazazamowien.Wyszukaj(nrZamowienia);
		if(zam==null) System.out.print("Zamowienie nie znalezione.");
		else System.out.print(zam);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Zakonczobslugezamowienia() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Polaczzamowienia() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Wydrukujrachunek() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Zastosujrabat() {
		// begin-user-code
		// TODO Auto-generated method stub
		Rabat rab = new Rabat(0);
		bazarabatow.Dodaj(rab);
		
		Rabat raba=bazarabatow.Wyszukaj(0);
		if (raba!=null)
		{
			raba.Wyswietlwarunki();
			raba.Zastosujrabat(bazazamowien);
		}
		
		
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Boolean Sprawdzuprawnienia() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Interfejs kelnera :: Sprawdz uprawnienia()\n");
		return systemuwierzytelniania.Sprawdzuprawnieniazalogowanego() == Uprawnienia.KELNER;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Zaloguj() {
		// begin-user-code
		// TODO Auto-generated method stub
		//System.out.print("Interfejs kelnera :: Zaloguj()\n");
		Kelner kl = new Kelner(Uprawnienia.KELNER, new String("haslo").hashCode());
		systemuwierzytelniania.Zaloguj(kl);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Wyloguj() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Wydrukujfakture() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private void Powiadomkuchnie(Zamowienie zam) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Interfejs kelnera :: Powiadom kuchnie()\n");

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Wyswietlrezerwacje() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer Dodajzamowienie() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Interfejs kelnera :: Dodaj zamowienie()\n");
		
		if (!Sprawdzuprawnienia()) Zaloguj();
		
		Stolik st = new Stolik();
		
		Zamowienie zam = bazazamowien.Dodaj(bazapromocji, st, (Kelner)systemuwierzytelniania.getUzytkownik());
		
		Zastosujrabat();
		
		Powiadomkuchnie(zam);
		
		return zam.getNumerzamowienia();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Rozdzielzamowienia() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public void Edytujzamowienie(Integer nrZamowienia) {
		
	}
	
	public Interfejskelnera(Systemuwierzytelniania system, Bazazamowien zamow, Bazarezerwacji rezerw, Bazarabatow rabat, Bazapromocji promocje) {
		systemuwierzytelniania = system;
		bazarezerwacji = rezerw;
		bazazamowien = zamow;
		bazarabatow = rabat;
		bazapromocji=promocje;
	}
	
}