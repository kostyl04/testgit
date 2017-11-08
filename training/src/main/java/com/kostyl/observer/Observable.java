package com.kostyl.observer;

public interface Observable {
	void addObserver(Observer o);

	void removeObserver(Observer o);

	 void notifyObservers(Object obsObj);
}
