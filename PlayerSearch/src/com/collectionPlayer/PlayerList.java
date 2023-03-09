package com.collectionPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class PlayerList {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please select the category on which you want to sort the players");
		System.out.println("1 for who played the most number of matches");
		System.out.println("2 for who has most runs");
		System.out.println("3 for who has taken most number of wickets");
		System.out.println("4 for according to their name");
		System.out.println("5 for according to their team");
		
		int i= sc.nextInt();
		
		Player p1= new Player("Rohit", 45, "India", 10, 10650, 41);
		Player p2= new Player("Virat", 18, "India", 5, 9006, 38);
		Player p3= new Player("Abdevilliers", 17, "South Africa", 25, 8550, 71);
		Player p4= new Player("Chris Gayle", 333, "West Indies", 60, 9950, 80);
		Player p5= new Player("Pollard", 55, "West Indies", 85, 9560, 91);
		Player p6= new Player("Bumrah", 93, "India", 151, 550, 81);
		Player p7= new Player("Hardik", 999, "India", 130, 4560, 52);
		Player p8= new Player("Malinga", 58, "Sri Lanka", 250, 1000, 100);
		Player p9= new Player("Guptil", 29, "New Zealand", 60, 5540, 91);
		Player p10= new Player("Surya", 77, "India", 8, 3550, 55);
		
		ArrayList<Player> player= new ArrayList<>();
		player.add(p1);
		player.add(p2);
		player.add(p3);
		player.add(p4);
		player.add(p5);
		player.add(p6);
		player.add(p7);
		player.add(p8);
		player.add(p9);
		player.add(p10);
		
		
		if(i==1){
			Collections.sort( player, new SortByMatches());
			
			for (Player player2 : player) {
				System.out.println(player2);
				
			}
		}
		if(i==2){
               Collections.sort( player, new SortByRun());
			
			for (Player player2 : player) {
				System.out.println(player2);
			}
		}
		if(i==3){
			Collections.sort( player, new SortByWickets());
			
			for (Player player2 : player) {
				System.out.println(player2);
			}
		}
		if(i==4){
			Collections.sort( player, new SortByName());
			
			for (Player player2 : player) {
				System.out.println(player2);
			}
		}
		if(i==5){
			Collections.sort( player, new SortByTeam());
			
			for (Player player2 : player) {
				System.out.println(player2);
			}
		}
		sc.close();
		
	}


}
