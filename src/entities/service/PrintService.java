package entities.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T printService) {
		list.add(printService);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Error 1>>> List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[" + list.get(0));
		if (list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}
}
