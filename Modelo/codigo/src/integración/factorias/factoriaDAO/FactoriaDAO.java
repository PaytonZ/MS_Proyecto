/**
 * 
 */
package integración.factorias.factoriaDAO;

import integración.clientes.dao.DAOCliente;
import integración.reservas.dao.DAOReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author NASAIII
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class FactoriaDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static FactoriaDAO factoriaDAOInstance;

	/** 
	 * @return el factoriaDAOInstance
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static FactoriaDAO getFactoriaDAOInstance() {
		// begin-user-code
		return factoriaDAOInstance;
		// end-user-code
	}

	/** 
	 * @param factoriaDAOInstance el factoriaDAOInstance a establecer
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setFactoriaDAOInstance(FactoriaDAO factoriaDAOInstance) {
		// begin-user-code
		FactoriaDAO.factoriaDAOInstance = factoriaDAOInstance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract DAOCliente generaDAOCliente();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract DAOReserva generaDAOReserva();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static FactoriaDAO getInstance() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}
}