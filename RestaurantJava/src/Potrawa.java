
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
public class Potrawa {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String Nazwapotrawy;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Float Cenasugerowana;
	
	public Potrawa(String nazwa, Float cena) {
		Nazwapotrawy=nazwa;
		Cenasugerowana=cena;
	}
	
	public Float getCenasugerowana() {
		return Cenasugerowana;
	}
	
	public String toString() {
		return Nazwapotrawy;
	}
}