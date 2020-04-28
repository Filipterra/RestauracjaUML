/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Systemuwierzytelniania {
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazauzytkownikow bazauzytkownikow;
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Uzytkownik uzytkownik;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Uprawnienia Sprawdzuprawnieniazalogowanego() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("System uwierzytelniania :: Sprawdz uprawnienia zalogowanego()\n");
		
		if(uzytkownik==null) return Uprawnienia.BRAK;
		
		Uzytkownik uz = bazauzytkownikow.Wyszukaj(uzytkownik.getID());
		if (uz!=null) return uz.getUprawnienia();
		
		return Uprawnienia.BRAK;
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
	public Boolean Zaloguj(Uzytkownik uz) {
		// begin-user-code
		// TODO Auto-generated method stub
		if(bazauzytkownikow.Wyszukaj(uz.getID())!=null) {
			uzytkownik=uz;
			return true;
		}
		return false;
		// end-user-code
	}
	
	public Integer Hash(String haslo) {
		return haslo.hashCode();
	}
	
	public Systemuwierzytelniania(Bazauzytkownikow bd) {
		bazauzytkownikow=bd;
		uzytkownik=null;
	}
	
	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}
}