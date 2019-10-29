/*
 * @author: Kevin Chung
 */
package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class LabNumber11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Interstellar", "scifi"));
		movieList.add(new Movie("Avatar", "scifi"));
		movieList.add(new Movie("The Shawshank Redemption", "drama"));
		movieList.add(new Movie("Insidious", "horror"));
		movieList.add(new Movie("The Conjuring", "horror"));
		movieList.add(new Movie("The Blair Witch Project", "horror"));
		movieList.add(new Movie("Finding Nemo", "animated"));
		movieList.add(new Movie("Toy Story", "animated"));
		movieList.add(new Movie("How to Train Your Dragon", "animated"));
		movieList.add(new Movie("Ratatouille", "animated"));
		for (int i = 1; i <= 100; i++) {
			movieList.add(MovieIO.getMovie(i));
		}
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are " + movieList.size() + " movies in this list.");

		String toContinue = "y";
		while (toContinue.equalsIgnoreCase("y")) {
			int movieChoice = Validator.getInt(scan, "\nWhat category are you interested in? Please choose the number:"
					+ "\n1. scifi\n2. drama\n3. horror\n4. animated\n");
			
			switch (movieChoice) {
			case 1:
				for (Movie movie : movieList) {
					if (movie.category.equals("scifi")) {
						System.out.println(movie);
					}
				}
				break;
			case 2:
				for (Movie movie : movieList) {
					if (movie.category.equals("drama")) {
						System.out.println(movie);
					}
				}
				break;
			case 3:
				for (Movie movie : movieList) {
					if (movie.category.equals("horror")) {
						System.out.println(movie);
					}
				}
				break;
			case 4:
				for (Movie movie : movieList) {
					if (movie.category.equals("animated")) {
						System.out.println(movie);
					}
				}
				break;
			default:
				System.out.println("There are no movies for that option. ");
				break;
			}

			toContinue = Validator.getString(scan, "\nWould you like to continue? (y/n): ").substring(0, 1);
		}

		System.out.println("\nHave a nice day!");

		scan.close();
	}

}
