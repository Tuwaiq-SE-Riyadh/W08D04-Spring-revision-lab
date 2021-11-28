package com.example.demo.Author;



import javax.persistence.*;


@Entity
@Table(name = "Admin")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AuthorId;
    private String name;
    private int age;
    private String nationality;
    private String gender;

    public Author(long authorId, String name, int age,String nationality, String gender) {
        AuthorId = authorId;
        this.name = name;
        this.age = age;
        this. nationality=nationality;
        this.gender = gender;

    }

    public long getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(long authorId) {
        AuthorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}


