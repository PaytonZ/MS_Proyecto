/**
 * 
 */
package negocio.departamentos.servicioaplicacion.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import negocio.departamentos.objetonegocio.Departamento;
import negocio.departamentos.servicioaplicacion.SADepartamentos;
import negocio.departamentos.transfer.transferDepartamento;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Emilio
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class SAdepartamentosImp implements SADepartamentos {
	/** 
	 * (sin Javadoc)
	 * @see SADepartamentos#anadirDepartamento(Object departamentoNuevo)
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void anadirDepartamento(Object departamentoNuevo) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADepartamentos#borrarDepartamento(Object idDepartamento)
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Object borrarDepartamento(Integer idDepartamento) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("SADepartamentos");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Departamento dep = em.find(Departamento.class, idDepartamento);
		String query = "DELETE FROM Departamamentos where Departamento = " + dep.toString();
		em.persist(dep);
		em.getTransaction().commit();
		em.persist(em);
		// No hay close en transacciones de entitymanager?? 
		
		
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADepartamentos#actualizarDepartamento(Object departamento)
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void actualizarDepartamento(Object departamento) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADepartamentos#obternerDepartamento(Object idDepartamento)
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Object obternerDepartamento(Object idDepartamento) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADepartamentos#obtenerTodoslosDepartamentos()
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void obtenerTodoslosDepartamentos() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}
}