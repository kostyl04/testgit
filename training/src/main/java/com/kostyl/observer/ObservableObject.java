package com.kostyl.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableObject<T> implements Observable {
	private List<Observer<T>> observers=new ArrayList<>();

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers(Object obsObj) {

		for (Observer<T> o : observers)
			o.observe((T) obsObj);

	}

}
