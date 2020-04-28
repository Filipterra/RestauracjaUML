
/**
 * 
 */

import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Bazazamowien {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Zamowienie> zamowienie;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Zamowienie Dodaj(Bazapromocji bazapromocji, Stolik st, Kelner kelner) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Baza zamowien :: Dodaj()\n");
		
		Zamowienie zam=new Zamowienie(bazapromocji, st, kelner);
		
		Potrawa pot = new Potrawa("Klopsy", 18.30f);
		zam.Dodajpotrawe(pot);
		pot = new Potrawa("Salatka", 6.70f);
		zam.Dodajpotrawe(pot);
		pot = new Potrawa("Pomidorowa", 11.60f);
		zam.Dodajpotrawe(pot);
		
		zam.Zastosujpromocje();
		
		zamowienie.add(zam);
		
		return zam;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Edytuj(Integer ID) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Baza zamowien :: Edytuj()\n");

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Usun() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Zamowienie Wyszukaj(Integer nr) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Baza zamowien :: Wyszukaj()\n");
		
		for (Zamowienie zam : zamowienie) {
			if (zam.getNumerzamowienia().equals(nr)) return zam;
		}
		return null;
		// end-user-code
	}
	
	public Bazazamowien() {
		zamowienie=new HashSet<>();
	}
}