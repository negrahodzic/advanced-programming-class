package rs.ac.bg.fon.nprog.projekat.domain;

import java.util.Date;

public class Projection {
    private Long id;
    private Date time;
    private Date date;
    private String technology;
    private Boolean subtitle;
    private Movie movie;
    private Room room;

    public Projection() {
    }

    public Projection(Long id, Date time, Date date, String technology, Boolean subtitle, Movie movie, Room room) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.technology = technology;
        this.subtitle = subtitle;
        this.movie = movie;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Boolean getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Boolean subtitle) {
        this.subtitle = subtitle;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
