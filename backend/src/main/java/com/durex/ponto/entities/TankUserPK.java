package com.durex.ponto.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class TankUserPK implements Serializable {
	private static final long serialVersionUID = 1L;


	@ManyToOne
	@JoinColumn(name="tank_id")
	private Tank tank;
	

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public TankUserPK() {
		
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
