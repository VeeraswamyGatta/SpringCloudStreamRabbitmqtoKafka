package com.veera.stream.domain;

import java.io.Serializable;

public class Data implements Serializable {

	private String id;
	private String name;
	private String gender;
	private String cls;
	private String seat;
	private String club;
	private String persona;
	private String crush;
	private String breastSize;
	private String strength;
	private String hairstyle;
	private String color;
	private String eyes;
	private String eyeType;
	private String stockings;
	private String accessory;
	private String scheduleTime;
	private String scheduleDestination;
	private String scheduleAction;
	private String info;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getCrush() {
		return crush;
	}

	public void setCrush(String crush) {
		this.crush = crush;
	}

	public String getBreastSize() {
		return breastSize;
	}

	public void setBreastSize(String breastSize) {
		this.breastSize = breastSize;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getHairstyle() {
		return hairstyle;
	}

	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getEyeType() {
		return eyeType;
	}

	public void setEyeType(String eyeType) {
		this.eyeType = eyeType;
	}

	public String getStockings() {
		return stockings;
	}

	public void setStockings(String stockings) {
		this.stockings = stockings;
	}

	public String getAccessory() {
		return accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getScheduleDestination() {
		return scheduleDestination;
	}

	public void setScheduleDestination(String scheduleDestination) {
		this.scheduleDestination = scheduleDestination;
	}

	public String getScheduleAction() {
		return scheduleAction;
	}

	public void setScheduleAction(String scheduleAction) {
		this.scheduleAction = scheduleAction;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Data{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", cls='" + cls + '\'' +
				", seat='" + seat + '\'' +
				", club='" + club + '\'' +
				", persona='" + persona + '\'' +
				", crush='" + crush + '\'' +
				", breastSize='" + breastSize + '\'' +
				", strength='" + strength + '\'' +
				", hairstyle='" + hairstyle + '\'' +
				", color='" + color + '\'' +
				", eyes='" + eyes + '\'' +
				", eyeType='" + eyeType + '\'' +
				", stockings='" + stockings + '\'' +
				", accessory='" + accessory + '\'' +
				", scheduleTime='" + scheduleTime + '\'' +
				", scheduleDestination='" + scheduleDestination + '\'' +
				", scheduleAction='" + scheduleAction + '\'' +
				", info='" + info + '\'' +
				'}';
	}
}
