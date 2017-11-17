package ru.javabegin.training.springlibrary.objects;
public class Book
{
    private Author author;
    private Genre genre;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Integer publishYear;
    private byte[] image;
    private String descr;
    private Integer rating;
    private Long voteCounter;


    public Book(Author author, Genre genre, String name, byte[] content, Integer pageCount, String isbn, Integer publishYear, byte[] image, String descr, Integer rating, Long voteCounter)
    {
        this.author = author;
        this.genre = genre;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.image = image;
        this.descr = descr;
        this.rating = rating;
        this.voteCounter = voteCounter;
    }


    public Author getAuthor()
    {
        return author;
    }


    public void setAuthor(Author author)
    {
        this.author = author;
    }


    public Genre getGenre()
    {
        return genre;
    }


    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public byte[] getContent()
    {
        return content;
    }


    public void setContent(byte[] content)
    {
        this.content = content;
    }


    public Integer getPageCount()
    {
        return pageCount;
    }


    public void setPageCount(Integer pageCount)
    {
        this.pageCount = pageCount;
    }


    public String getIsbn()
    {
        return isbn;
    }


    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }


    public Integer getPublishYear()
    {
        return publishYear;
    }


    public void setPublishYear(Integer publishYear)
    {
        this.publishYear = publishYear;
    }


    public byte[] getImage()
    {
        return image;
    }


    public void setImage(byte[] image)
    {
        this.image = image;
    }


    public String getDescr()
    {
        return descr;
    }


    public void setDescr(String descr)
    {
        this.descr = descr;
    }


    public Integer getRating()
    {
        return rating;
    }


    public void setRating(Integer rating)
    {
        this.rating = rating;
    }


    public Long getVoteCounter()
    {
        return voteCounter;
    }


    public void setVoteCounter(Long voteCounter)
    {
        this.voteCounter = voteCounter;
    }
}
