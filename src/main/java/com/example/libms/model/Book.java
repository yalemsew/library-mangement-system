package com.example.libms.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(unique = true, nullable = false)
    private String isbn;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "book_authors", //joining table
            joinColumns = @JoinColumn(name = "book_id"),//which entity owns the association
            inverseJoinColumns = @JoinColumn(name = "author_id")) // other entity, author's pk or any other fields
    private List<Author> authors;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Publisher publisher;// book->----//-publisher ;
    public Book() {
    }
}
