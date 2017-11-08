package com.kostyl.observer;

public class ObjectChangeObserver implements Observer<ObsObject> {
	private ObsObject lastModifiedObj;

	@Override
	public void observe(ObsObject obsObj) {
		if (lastModifiedObj == null) {
			System.out.println(obsObj.getClass().getSimpleName() + " CREATED!");
			this.lastModifiedObj = new ObsObject(obsObj);
			System.out.println(obsObj);
		} else {
			if (obsObj.equals(lastModifiedObj))
				System.out.println(obsObj.getClass().getSimpleName() + " NOT  CHANGED ");
			else {
				System.out.println(obsObj.getClass().getSimpleName() + " CHANGED from " + this.lastModifiedObj
						+ "\nto\n" + obsObj);
				this.lastModifiedObj = new ObsObject(obsObj);
			}

		}

	}

}
