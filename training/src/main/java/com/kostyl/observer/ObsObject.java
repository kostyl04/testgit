package com.kostyl.observer;

public class ObsObject extends ObservableObject<ObsObject> {
	public ObsObject(ObsObject obj) {
		super();
		this.name = obj.name;
		this.surName = obj.surName;
	}

	private String name;
	private String surName;

	public ObsObject(String name, String surName) {
		super();
		this.name = name;
		this.surName = surName;
		this.addObserver(new ObjectChangeObserver());
		notifyObservers(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers(this);
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
		notifyObservers(this);
	}

	@Override
	public String toString() {
		return "ObsObject [name=" + name + ", surName=" + surName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObsObject other = (ObsObject) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

}
