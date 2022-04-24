package com.durex.ponto.dto;

import com.durex.ponto.entities.Tank;

public class TankDTO {
	private Integer id;

	private String name;
	private String description;

	private Integer heigth;
	private Integer width;
	private Integer length;
	private Integer volume;
	
	public TankDTO() {
	}

	public TankDTO(Integer id, String name, String description, Integer heigth, Integer width, Integer length,
			Integer volume) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.heigth = heigth;
		this.width = width;
		this.length = length;
		this.volume = volume;
	}
	
	public TankDTO(Tank tank) {
		id = tank.getId();
		name = tank.getName();
		description = tank.getDescription();
		heigth = tank.getHeigth();
		width = tank.getWidth();
		length = tank.getLength();
		volume = tank.getVolume();
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getHeigth() {
		return heigth;
	}

	public void setHeigth(Integer heigth) {
		this.heigth = heigth;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	
	
}
