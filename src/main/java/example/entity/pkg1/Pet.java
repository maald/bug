package example.entity.pkg1;

import javax.persistence.*;

@Entity
@Table(name = "Pets")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ownerId")
	private Person owner;
	
	
	public Pet() {}
}
