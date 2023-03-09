package com.collectionPlayer;

import java.util.Comparator;

public class SortByName implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.getPName().compareTo(o2.getPName());
	}

}
