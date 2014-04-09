package com.rmuti;

public class PeterCech {
	private String name;
	private String position;
	private String friend[];
	
	public PeterCech() {
		name = "PeterCech";
		position = "GoalKeeper";
		friend = new String [] {"JohnTerry","FrankLampard","FernandoTorres"};
	}
	
	public PeterCech(int a) {
		System.out.println("PeterCech Overloading 1");
	}

	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}

	public String[] getFriend() {
		return friend;
	}	
}


