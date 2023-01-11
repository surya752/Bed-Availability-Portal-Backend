package com.bedavailabilityportal.AdminHospital.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "hospital")
@Builder
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hospitalId")
	private Long hId;
	@Column(name="hospitalName")
	@NotNull(message = "hospitalName")
	private String hName;
	@Column(name="hospitalNumber")
	@NotNull(message = "hospitalNumber")
	@Size(min = 2, message = " Name should have atleast 2 characters")
	private String hNumber;
	@Column(name="hospitalAddress")
	@NotNull(message = "hospitalAddress")
	private String hAddress;
	@Column(name="hospitalState")
	@NotNull(message = "hospitalState")
	private String hState;
	@Column(name="hospitalCity")
	@NotNull(message = "hospitalCity")
	private String hCity;
	@Column(name="hospitalType")
	@NotNull(message = "hospitalType")
	private String hType;

	public Hospital(Long hId, String hName, String hNumber, String hAddress, String hState, String hCity, String hType) {
		this.hId = hId;
		this.hName = hName;
		this.hNumber = hNumber;
		this.hAddress = hAddress;
		this.hState = hState;
		this.hCity = hCity;
		this.hType = hType;
	}

	public Long gethId() {
		return hId;
	}

	public void sethId(Long hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethNumber() {
		return hNumber;
	}

	public void sethNumber(String hNumber) {
		this.hNumber = hNumber;
	}

	public String gethAddress() {
		return hAddress;
	}

	public void sethAddress(String hAddress) {
		this.hAddress = hAddress;
	}

	public String gethState() {
		return hState;
	}

	public void sethState(String hState) {
		this.hState = hState;
	}

	public String gethCity() {
		return hCity;
	}

	public void sethCity(String hCity) {
		this.hCity = hCity;
	}

	public String gethType() {
		return hType;
	}

	public void sethType(String hType) {
		this.hType = hType;
	}

	@Override
	public String toString() {
		return "Hospital{" +
				"hId=" + hId +
				", hName='" + hName + '\'' +
				", hNumber='" + hNumber + '\'' +
				", hAddress='" + hAddress + '\'' +
				", hState='" + hState + '\'' +
				", hCity='" + hCity + '\'' +
				", hType='" + hType + '\'' +
				'}';
	}
}
