
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
public class Bazauzytkownikow {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Uzytkownik> uzytkownik;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Dodaj(Uzytkownik uz) {
		// begin-user-code
		// TODO Auto-generated method stub
		uzytkownik.add(uz);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Uzytkownik Wyszukaj(Integer id) {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Baza uzytkownikow :: Wyszukaj()\n");
		
		for (Uzytkownik uz : uzytkownik) {
			if (uz.getID().equals(id)) return uz;
		}
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void Edytuj() {
		// begin-user-code
		// TODO Auto-generated method stub

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
	
	public Bazauzytkownikow() {
		uzytkownik=new HashSet<>();
	}
	
	public void Test() {
		Kelner kl = new Kelner(Uprawnienia.KELNER, new String("haslo").hashCode());
		Dodaj(kl);
	}
}