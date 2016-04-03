package books;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Program: BookApp
 * Project: AssignmentBooks
 * Package: 
 * @author Taizya
 * @since Aug 31, 2015
 * 
 */
public class BookApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Book> myList = Book.getList("books.csv");
		int lineCount = myList.size();
		
		System.out.println("Number of Lines Read: "+ lineCount);
		
		Collections.sort(myList);
		System.out.println("\nSorted Book List: ");
		printList(myList);
		
		Comparator<Book> reverseOrder = Collections.reverseOrder();
		Collections.sort(myList, reverseOrder);
		System.out.println("\nReverse Order:");
		printList(myList);
		
	}
	/**
	 * prints out the list of books using a loop
	 * @param list
	 */
		private static void printList(List<Book> list) { 

			for (Book e: list) { 
				System.out.println(e.toString()); 
				} 
			} 
}

