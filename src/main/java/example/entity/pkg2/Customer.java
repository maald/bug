package example.entity.pkg2;

import java.util.Set;

import javax.persistence.*;

import org.eclipse.persistence.annotations.CascadeOnDelete;

@Entity
@Table(name = "Customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@OneToMany(mappedBy = "customer")
	@CascadeOnDelete							// being tested. Expected: generate "ON DELETE CASCADE" DDL
	private Set<Address> addresses;
	
	@OneToMany(mappedBy = "customer")
	@CascadeOnDelete							// being tested. Expected: "ON DELETE CASCADE" DDL
	private Set<Phone> phones;
	
	
	public Customer() {}

}
