 package com.collectionPlayer;

import java.util.Comparator;

public class SortByWickets implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getPWickets()-o1.getPWickets();
	}

}
