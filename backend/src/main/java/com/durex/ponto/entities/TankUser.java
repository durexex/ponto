package com.durex.ponto.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tank_user")
public class TankUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TankUserPK id = new TankUserPK();
	
	public TankUser() {
		
	}

	public TankUserPK getId() {
		return id;
	}

	public void setId(TankUserPK id) {
		this.id = id;
	}
	
	public void setTank(Tank tank) {
		id.setTank(tank);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
}
