package example.entity.pkg2;

import javax.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
	public Address() { }
}
