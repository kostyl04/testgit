package com.kostyl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kostyl.observer.ObsObject;
import com.kostyl.unmodifable.TestObj;

/**
 * Hello world!
 */
public class App {
	private List<TestObj> list = new ArrayList<>();

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObsObject obsObject=new ObsObject("ROMAN","KOSTYLENKO");
		
		obsObject.setName("ROMAN");
		obsObject.setSurName("EBLAN");

	}

}
