package example.entity.pkg1;

import javax.persistence.*;

@Entity
@Table(name = "Cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ownerId")
	private Person owner;

	
	public Car() { }
}
