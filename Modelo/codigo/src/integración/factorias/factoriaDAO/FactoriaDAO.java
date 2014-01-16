/**
 * 
 */
package integraci�n.factorias.factoriaDAO;

import integraci�n.clientes.dao.DAOCliente;
import integraci�n.reservas.dao.DAOReserva;
import integraci�n.habitaciones.dao.DAOHabitacion;
import integraci�n.empleados.dao.DAOEmpleado;
import integraci�n.departamentos.dao.DAODepartamento;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public abstract class FactoriaDAO {
	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	private static FactoriaDAO factoriaDAOInstance;

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract Object generaDAOCliente();

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract DAOReserva generaDAOReserva();

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public static FactoriaDAO getInstance() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
}

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract DAOHabitacion generaDAOHabitacion() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract DAOReserva generaDAOTarea() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract Object generaDAOEmpleado() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @return
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
	public abstract Object generaDAODepartamento() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}
}