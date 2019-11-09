package com.inherit;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SavingAccount  extends Account{
	
	@Column(name="amount")
	int  amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
