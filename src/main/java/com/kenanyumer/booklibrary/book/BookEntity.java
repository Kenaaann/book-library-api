package com.kenanyumer.booklibrary.book;

import jakarta.persistence.*;

import java.awt.print.Book;

@Table(name="books")
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int pagesNumber;

    public BookEntity(String name, int pagesNumber){
        this.name = name;
        this.pagesNumber = pagesNumber;
    }

    public BookEntity(){
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getPagesNumber(){
        return this.pagesNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPagesNumber(int pagesNumber){
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString(){
        return this.id + " : " + this.name + " has " + this.pagesNumber + " pages.";
    }
}
