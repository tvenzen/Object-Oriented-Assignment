package oop;

public class RPG extends Videogame {
	//Child of videogame, shows inheritance.
	private String title = null;
	private char rating = ' ';
	private String company = null;
	private double price = 0.0;
	private String genre = "RPG";  //Unchanging genre specific to this object type.
	
	//Constructor for RPG object empty values.
	public RPG(){
		this.title = null;
		this.rating = ' ';
		this.company = null;
		this.price = 0.0;
	}
	//Constructor for RPG object specified values
	public RPG(String t, char r, String c, Double p){
		this.title = t;
		this.rating = r;
		this.company = c;
		this.price = p;
	}
	
	//Returns object specific genre
	public String getGenre(){
		return genre;
	}
}
