package com.Iseac;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="trainee")

public class Trainee extends Employee{

	float paperhour;
	String contractperiod;

	public Trainee(float paperhour, String contractperiod, String name) {
		super(name);
		this.paperhour = paperhour;
		this.contractperiod = contractperiod;
	}
	public float getPaperhour() {
		return paperhour;
	}
	public void setPaperhour(float paperhour) {
		this.paperhour = paperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}

}
