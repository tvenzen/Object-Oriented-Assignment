package oop;

public class Videogame implements IVideogame{
	//Parent class that implements an interface.
	
	//Members that hold defining characteristics of each instance of this object.
	//All memebers are private, shows Encapsulation.
	private String title = null;
	private char rating = ' ';
	private String company = null;
	private double price = 0.0;
	private String genre = " ";
	
	//Constructor with unspecified values
	public Videogame(){
		this.title = null;
		this.rating = ' ';
		this.company = null;
		this.price = 0.0;
	}
	
	//Constructor with specified values, shows polymorphism.
	public Videogame(String t, char r, String c, Double p){
		this.title = t;
		this.rating = r;
		this.company = c;
		this.price = p;
	}
	
	//The next four methods set values for object members.
	public void setTitle(String s){
		this.title = s;
	}
	
	public void setRating(char r){
		this.rating = r;
	}
	
	public void setCompany(String c){
		this.company = c;
	}
	
	public void setPrice(double p){
		this.price = p;
	}
	
	//Next five methods return specified values.
	public String getTitle(){
		return title;
	}
	
	public char getRating(){
		return rating;
	}
	
	public String getCompany(){
		return "Created by: " + company;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getGenre(){
		return genre;
	}
	
	@Override
	//Overrides toString() to output all info of the object.
	public String toString(){
		String output = null; //Holds string to be returned.
		output = "The title of this game is: " + "'" + title + "'" +
				" and was made by: " + company + "." + " It has an ESRB rating of: " + rating +
				", and costs: $" + price +"\n";
		return output;
	}
	
	//Intricate way of both defining, and returning object info. Another example of polymorphism.
	public String toString(String t, char r, String c, double p){
		String output = null;
		this.title = t;
		this.rating = r;
		this.company = c;
		this.price = p;
		
		output = "The title of this game is: " + "'" + t + "'" +
				" and was made by: " + c + "." + " It has a rating of: " + r +
				" and costs: $" + p;
		return output;
	}
}
