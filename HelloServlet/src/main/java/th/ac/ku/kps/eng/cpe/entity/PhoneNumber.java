package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber implements Serializable{
	@JsonProperty
	public String number;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumber() {
		
	}
	public PhoneNumber(String s) {
		this.number = s;
	}
}