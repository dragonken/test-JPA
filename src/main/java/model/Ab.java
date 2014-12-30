package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AB database table.
 * 
 */
@Entity
@NamedQuery(name="Ab.findAll", query="SELECT a FROM Ab a")
public class Ab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int a;

	private String b;

	public Ab() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}

}