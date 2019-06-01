package example.entity.pkg2;

import javax.persistence.*;

@Entity
@Table(name = "Phones")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
	public Phone() {}
}
