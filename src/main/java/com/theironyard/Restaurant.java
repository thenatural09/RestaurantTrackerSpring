package com.theironyard;

import javax.persistence.*;

/**
 * Created by zach on 6/21/16.
 */
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    int rating;

    @Column(nullable = false)
    String comment;

    @ManyToOne
    User user;

    public Restaurant() {
    }

    public Restaurant(String name, String location, int rating, String comment, User user) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
