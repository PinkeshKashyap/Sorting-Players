package com.collectionPlayer;

import java.util.Comparator;

//Comparable -> compareTo(1 arg)
//Comparator ->compare(2 arg)

public class SortByMatches implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getPMatches()-o1.getPMatches();
	}
	
	

}
