package com.accolite.spr;

public class ChessCoach implements Coach{
	private String getPerformace;
	private FortuneService fortune;

	public ChessCoach() {
		
	}
	
	
	
	public String getGetPerformace() {
		return getPerformace;
	}



	public void setGetPerformace(String getPerformace) {
		System.out.println("getPerformace method");
		this.getPerformace = getPerformace;
		//System.out.println(getPerformace);
	}



	public ChessCoach(FortuneService fortune) {
		this.fortune=fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		System.out.println("concentrate");
		return "think then move";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//System.out.println("");
		return fortune.getFortune();
	}
	
}
