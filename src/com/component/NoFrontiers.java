package com.component;

public class NoFrontiers extends Exception {
	private boolean gotFrontiers;
	
	public NoFrontiers()
	{
		this.gotFrontiers = false;
	}
	
	public void printStackTrace()
	{
		System.err.println("[INFO] This country got no frontiers");
	}
	
	public boolean getIfFrontier()
	{
		return this.gotFrontiers;
	}
	
	public void setIfFrontier(boolean is)
	{
		this.gotFrontiers = is;
	}
}
