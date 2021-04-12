package oop;

public class Platformer extends Videogame{
	
	//Child of videogame, shows inheritance.
	private String title = null;
	private char rating = ' ';
	private String company = null;
	private double price = 0.0;
	private String genre = "Platformer"; //Unchanging genre specific to this object type.
	
	//Constructor for Platformer empty values
	public Platformer(){
		this.title = null;
		this.rating = ' ';
		this.company = null;
		this.price = 0.0;
	}
	
	//Constructor for Platformer specified values.
	public Platformer(String t, char r, String c, Double p){
		this.title = t;
		this.rating = r;
		this.company = c;
		this.price = p;
	}
	
	//Returns object specific genre.
	public String getGenre(){
		return genre;
	}
	
}
