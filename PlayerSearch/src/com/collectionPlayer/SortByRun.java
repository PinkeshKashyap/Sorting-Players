package com.collectionPlayer;

import java.util.Comparator;

public class SortByRun implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getPRuns()-o1.getPRuns();
	}

	
}
