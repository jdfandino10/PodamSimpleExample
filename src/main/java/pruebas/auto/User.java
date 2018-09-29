package pruebas.auto;

import uk.co.jemos.podam.common.PodamConstructor;

public class User {
	
	public enum University {
		UNIANDES,
		NACIONAL,
		PUJ,
		ROSARIO,
		JORGE_TADEO_LOZANO,
		SABANA,
		NACIONAL_MEDELLIN,
		ESCUELA_ING,
		EXTERNADO,
		ICESI,
		ANTIOQUIA,
		UNAD,
		CESA
	}
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private University university;
	
	private boolean master;
	
	@PodamConstructor
	public User(String firstName, String lastName, String email, University university, boolean master,
			String degreeName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.university = university;
		this.master = master;
		this.degreeName = degreeName;
		this.password = password;
	}

	private String degreeName;
	
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public boolean isMaster() {
		return master;
	}

	public void setMaster(boolean master) {
		this.master = master;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("User: ");
		sb.append(firstName + " ")
			.append(lastName + " ")
			.append(email + " ")
			.append(university.name() + " ")
			.append(degreeName + " ")
			.append(master ? "master " : "bachelors ")
			.append(password);
		return sb.toString();
	}
 

}
