package com.collectionPlayer;

import java.util.Comparator;

public class SortByTeam implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.getPTeam().compareTo(o2.getPTeam());
	}

}
