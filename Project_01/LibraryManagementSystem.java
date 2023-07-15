public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        // Create Magazine objects
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        // Create LibraryMember objects
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");
		
		// Set properties of objects using setter methods
        book1.setTitle("New Title");
        book1.setAuthor("New Author");
        book2.setNumPages(300);
        magazine1.setIssueDate("September 2023");
        magazine1.setPublisher("Updated Publisher");
        member1.setName("John Smith");

        // Check out and check in a library item
        book1.checkOut();
        book1.checkIn();

        // Display details of library items and members
        LibraryItem[] libraryItems = {book1, book2, book3, book4, book5, magazine1, magazine2, magazine3, magazine4, magazine5};
        for (LibraryItem item : libraryItems){
            item.displayItemDetails();
            System.out.println();
        }

        LibraryMember[] libraryMembers = {member1, member2, member3, member4, member5};
        for (LibraryMember member : libraryMembers){
            member.displayMemberDetails();
            System.out.println();
		}
	}
}
