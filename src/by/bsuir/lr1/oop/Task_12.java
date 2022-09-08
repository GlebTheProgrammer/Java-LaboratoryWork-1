package by.bsuir.lr1.oop;

public class Task_12
{
    public static void main(String[] args)
    {
        Book book = new Book("Hello World", "Gleb Sukristik", 1, 156329);
        System.out.printf("Hash: %d\n", book.hashCode());
        System.out.printf("Equals: %b\n", book.equals("hey"));
        System.out.println("ToString:\n"+book.toString());
    }
}

class Book implements Comparable<Book>
{
    public String title;
    public String author;
    public int price;
    private static int edition = 111111;
    private int isbn;

    public Book(String title, String author, int price, int isbn)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int hashCode()
    {
        return title.hashCode() + author.hashCode() + price + edition + isbn;
    }

    @Override
    public boolean equals(Object obj)
    {
        Book objAsABook;
        try
        {
            objAsABook = (Book) obj;

            if (objAsABook.price != price)
                return false;
            if (objAsABook.author != author)
                return false;
            if (objAsABook.title != title)
                return false;
            if (objAsABook.isbn != isbn)
                return false;
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Title: " + title + "\nAuthor: " + author + "\n" +
                "Price: " + price + "$\nEdition: " + edition + "\nIsbn: " + isbn;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book o)
    {
        if (o == null)
            throw new NullPointerException();

        if (this.isbn - o.isbn > 0)
            return 1;
        if (this.isbn - o.isbn < 0)
            return -1;

        return 0;
    }
}

