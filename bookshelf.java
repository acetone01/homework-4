import java.util.ArrayList;

public class bookshelf
{
    private char letter;
    private ArrayList<book> shelf;

    public bookshelf(char letter)
    {
        this.letter = letter;
        this.shelf = new ArrayList<>();
    }

    // Getters
    public char getLetter() { return letter; }
    public ArrayList<book> getShelf() { return shelf; }

    public  void addBook(book book)
    {
        if(book.getTitle().charAt(0) == letter && shelf.size() < 8)
        {
            shelf.add(book);
        }
    }

    public void removeBook(book book) { shelf.remove(book); }

    public String toString()
    {
        if(shelf.isEmpty())
        {
            return "-";
        }
        else
        {
        StringBuilder result = new StringBuilder();
        for (book book : shelf)
        {
            result.append(book.getTitle()).append("   ");
        }
            return result.toString().trim();
        }
    }   
}