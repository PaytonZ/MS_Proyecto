/**
 * 
 */
package negocio.departamentos.objetonegocio;


import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import java.util.Set;
import javax.persistence.OneToMany;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Emilio
 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
@Table(name = "departamentos")
@Entity
@NamedQueries({
		@NamedQuery(name = "negocio.departamentos.objetonegocio.Departamento.findByid", query = "select obj from Departamento obj where obj.id = :id"),
		@NamedQuery(name = "negocio.departamentos.objetonegocio.Departamento.findBynombre", query = "select obj from Departamento obj where obj.nombre = :nombre"),
		@NamedQuery(name = "negocio.departamentos.objetonegocio.Departamento.findByempleado", query = "select obj from Departamento obj where obj.empleado = :empleado"),
		@NamedQuery(name = "negocio.departamentos.objetonegocio.Departamento.findByactivo", query = "select obj from Departamento obj where obj.activo = :activo") })
public class Departamento implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private static final long serialVersionUID = 0;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Departamento() {
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@GeneratedValue
	@Id
	private Object id;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private Object nombre;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @uml.annotations for <code>empleado</code>
	 *     collection_type="negocio.empleados.objetonegocio.Empleado"
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@OneToMany(mappedBy = "departamento")
	private Set empleado;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private boolean activo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void getNombre() {
		// begin-user-code
		return nombre;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setNombre() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}
}