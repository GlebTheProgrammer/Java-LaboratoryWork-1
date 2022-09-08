package by.bsuir.lr1.oop;

public class Task_13
{
    public static void main(String[] args)
    {

    }
}

class ProgrammerBook extends Book
{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level)
    {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "\nLanguage: " + language + "\nLevel: " + level;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() + language.hashCode() + level;
    }

    @Override
    public boolean equals(Object o)
    {
        try
        {
            ProgrammerBook pBook = (ProgrammerBook)o;
            return super.equals(pBook) && (pBook.level == level) && (pBook.language == language);
        }
        catch (Exception exception)
        {
            return false;
        }
    }
}
