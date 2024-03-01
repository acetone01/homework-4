public class libraryTester
{
    public static void main(String[] args)
    {
        // Instantiates 2 bookshelf objects
        bookshelf sO = new bookshelf('O');
        bookshelf sT = new bookshelf('T');

        // Instantiates 4 books
        book book1 = new book("The Heart of the Betrayed", "Crime");
        book book2 = new book("Our Hill of Stars", "Fantasy");
        book book3 = new book("One of a Kind", "Science Fiction");
        book book4 = new book("The Vision of Roses", "Romance");

        // Prints both bookshelf objects
        System.out.println(sO);
        System.out.println(sT);

        // Prints each of the books
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        // Attempts to add each book the shelf 'O', then shelf 'T'
        sO.addBook(book1);
        sO.addBook(book2);
        sO.addBook(book3);
        sO.addBook(book4);

        sT.addBook(book1);
        sT.addBook(book2);
        sT.addBook(book3);
        sT.addBook(book4);

        // Prints both bookshelf objects
        System.out.println(sO);
        System.out.println(sT);
    }   
}
