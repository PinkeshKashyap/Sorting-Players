package com.collectionPlayer;

public class Player {
	
	public Player(String pName, int pId, String pTeam, int pWickets, int pRuns, int pMatches) {
		super();
		PName = pName;
		PId = pId;
		PTeam = pTeam;
		PWickets = pWickets;
		PRuns = pRuns;
		PMatches = pMatches;
	}
	private String PName;
	private int PId;
	private String PTeam;
	private int PWickets;
	private int PRuns;
	private int PMatches;
	
	
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public String getPTeam() {
		return PTeam;
	}
	public void setPTeam(String pTeam) {
		PTeam = pTeam;
	}
	public int getPWickets() {
		return PWickets;
	}
	public void setPWickets(int pWickets) {
		PWickets = pWickets;
	}
	public int getPRuns() {
		return PRuns;
	}
	public void setPRuns(int pRuns) {
		PRuns = pRuns;
	}
	public int getPMatches() {
		return PMatches;
	}
	public void setPMatches(int pMatches) {
		PMatches = pMatches;
	}
	@Override
	public String toString() {
		return "Player [PName=" + PName + ", PId=" + PId + ", PTeam=" + PTeam + ", PWickets=" + PWickets + ", PRuns="
				+ PRuns + ", PMatches=" + PMatches + "]";
	}


}
