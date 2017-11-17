package ru.javabegin.training.springlibrary.interfaces;
import ru.javabegin.training.springlibrary.objects.Book;

public interface EditBook
{
    boolean saveBook(Book book);

    boolean delete(Book book);

    boolean edit(Book book);

    boolean add(Book book);
}
