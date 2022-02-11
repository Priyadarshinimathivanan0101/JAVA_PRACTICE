
package nestedclass;
class Book{
    private String title;
    public Book(String title)
    {
        this.title = title;
    }
    public String toString()
    {
        return title;
    }
}
class BookList
{
    private BookNode list;
    public BookList()
    {
        list = null;
    }
    public void add(Book book)
    {
        BookNode node = new BookNode(book);
        BookNode tempNode;
        if(list == null)
            list = node;
        else
        {
            tempNode = list;
            while(tempNode.next != null)
            {
                tempNode = tempNode.next;
                tempNode.next = node;
            }
        }
    }
    public String toString()
        {
            String str ="";
            BookNode tempNode = list;
            while(tempNode != null)
            {
                str += tempNode.book + "\n";
                tempNode =tempNode.next;
            }
            return str;
        }
    private class BookNode{
        public Book book;
        public BookNode next;
        public BookNode(Book book)
        {
            this.book = book;
            next = null;
        }

    }
}
public class NestedClass {
    public static void main(String[] args) {
        BookList shelf = new BookList();
        shelf.add(new Book("Harry Potter"));
        shelf.add(new Book("Around the World in 80 Days"));
        shelf.add(new Book("Count of Monte Cristo"));
        shelf.add(new Book("Jataka Tales"));
        shelf.add(new Book("Aesop's Fables"));
        System.out.println(shelf);
        
    }
    
}
