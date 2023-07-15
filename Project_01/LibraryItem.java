abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
}
	public abstract void displayItemDetails();
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
	class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
    
    // Getters
    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
	
	// Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}

class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Item ID: " + getItemID());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
	
	// Getters
    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
}

	 public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
    
    // Getters
    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setName(String name) {
        this.name = name;
    }
}

