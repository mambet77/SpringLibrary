package ru.javabegin.training.springlibrary.objects;
import java.util.Date;

public class Author
{
    private String fio;
    private Date birtday;
    public Author(String fio, Date birtday)
    {
        this.fio = fio;
        this.birtday = birtday;
    }


    public String getFio()
    {
        return fio;
    }


    public void setFio(String fio)
    {
        this.fio = fio;
    }


    public Date getBirtday()
    {
        return birtday;
    }


    public void setBirtday(Date birtday)
    {
        this.birtday = birtday;
    }
}
