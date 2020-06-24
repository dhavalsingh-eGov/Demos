package com.example.school.models;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class students {

    private long id;
    private String name;
    private String city;
    private int age;
    private String board;
    private int grade;

    public students(){

    }

    public students(String name, String city, int age, String board, int grade) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.board = board;
        this.grade = grade;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "board", nullable = false)
    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }
    @Column(name = "grade", nullable = false)
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
