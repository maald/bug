package example.entity.pkg1;

import java.util.Set;

import javax.persistence.*;

import org.eclipse.persistence.annotations.CascadeOnDelete;

@Entity
@Table(name = "Persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy = "owner")
	@CascadeOnDelete							// being tested. Expected: generate "ON DELETE CASCADE" DDL
	private Set<Pet> pets;
	
	@OneToMany(mappedBy = "owner")
	@CascadeOnDelete							// being tested. Expected: generate "ON DELETE CASCADE" DDL
	private Set<Car> cars;
	
	
	public Person() {}
}
