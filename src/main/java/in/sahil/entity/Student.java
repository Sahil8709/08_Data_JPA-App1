package in.sahil.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_DTLS") // optional
public class Student {
	
	@Id
	@Column(name="student_id") // optional
	private Integer id;
	
	@Column(name="student_name")
    private String name;
	
	@Column(name="student_rank")
    private Long rank;
	
	@Column(name="student_gender")
    private String gender;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
