package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Program: Book
 * Project: AssignmentBooks
 * Package: 
 * @author Taizya
 * @since Aug 31, 2015
 * 
 */
public class Book implements Comparable<Book> {

	/**
	 * field title is the title of the book
	 */
	private String title;
	/**
	 * field author is the author of the book
	 */
	private String author;
	/**
	 * field year is the year when the book won the Pulitzer Prize
	 */
	private int year;
	
	/**
	 * parameterized constructor receives arguments for Book and assigns them to instance variables
	 * @param title title of the book
	 * @param author author of the book
	 * @param year year book won
	 */
	public Book(String title, String author, int year){
		
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}


	public int getYear() {
		return year;
	}
	
	/**
	 * toString method formats the title, author and year
	 */
	@Override
	public String toString(){
		
		return getTitle() + " by " + getAuthor() + "(" + getYear() + ")" ;
	}
	
	/**
	 * getList method returns a list of books read from a file in a specified format
	 * @param file
	 * @return
	 */
	public static List<Book> getList(String file){
		
		List<Book> list = new ArrayList<Book>();
		Scanner readFile = new Scanner(Book.class.getResourceAsStream(file));
		
		
		while (readFile.hasNextLine()) {
			String line = readFile.nextLine();
			String[] splitData = line.split("\\s*,\\s*");
			if(splitData.length != 3)
			{
				System.out.println("Problem Reading in line: " + line);
			}
			
			else
			{
					String myTitle = splitData[0];
					String myAuthor = splitData[1];
					int myYear = Integer.parseInt(splitData[2]);
					list.add(new Book(myTitle,myAuthor,myYear));
				
			}
				}
		
	
		return list;
	}
	
	
	@Override
	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}

	
}
