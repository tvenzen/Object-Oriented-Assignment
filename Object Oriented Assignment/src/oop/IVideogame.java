package oop;

public interface IVideogame {

		//Specifies methods that need to be implemented in the Videogame object.
		//Shows Abstraction.
		void setTitle(String s);
		void setRating(char r);
		void setCompany(String s);
		void setPrice(double p);
		String getTitle();
		char getRating();
		String getCompany();
		double getPrice();
		@Override
		String toString();
		
}
