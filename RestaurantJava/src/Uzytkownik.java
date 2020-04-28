/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */

	enum Uprawnienia {
		BRAK, KELNER, KELNER_UCZEN, MAGAZYNIER, ZARZADCA_SALI, OPERATOR, ADMINISTRATOR;
	}

public class Uzytkownik {
	
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer ID;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Uprawnienia uprawnienia;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String Zatrudnienie;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String Imie;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String Nazwisko;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer Skrothasla;
	
	static private Integer nextID=0;

	
	public Uzytkownik() {
		ID=nextID++;
		uprawnienia=Uprawnienia.BRAK;
		Zatrudnienie=null;
		Imie=null;
		Nazwisko=null;
		Skrothasla=null;
	}
	
	public Uzytkownik(Uprawnienia upraw, Integer haslo) {
		ID=nextID++;
		uprawnienia=upraw;
		Zatrudnienie=null;
		Imie=null;
		Nazwisko=null;
		Skrothasla=haslo;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Uprawnienia getUprawnienia() {
		return uprawnienia;
	}
}