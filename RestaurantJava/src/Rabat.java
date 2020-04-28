/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Filip
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Rabat {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Bazarabatow agreguje;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer IDrabatu;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Rabat (Integer ID)
	{
		IDrabatu=ID;
	}
	
	public void Wyswietlwarunki() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Rabat :: Wyswietl warunki()\n");

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Zastosujrabat(Bazazamowien baza) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Rabat :: Zastosuj rabat()\n");

		baza.Wyszukaj(0);
		baza.Edytuj(0);
		// end-user-code
	}
	
	public Integer getID()
	{
		return IDrabatu;
	}
}