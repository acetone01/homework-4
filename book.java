public class book
{
    private String title;
    public String genre;

    // Default Constructor
    public book(String title, String genre)
    {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String toString() { return title; }
}