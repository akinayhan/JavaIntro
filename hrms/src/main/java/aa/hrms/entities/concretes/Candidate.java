package aa.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")
public class Candidate {
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int birthdayYear;
}
