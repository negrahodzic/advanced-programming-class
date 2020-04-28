package rs.ac.bg.fon.nprog.projekat.domain;

import java.util.Date;

public class Reservation {
    private Long id;
    private Date timeOfReservation;
    private Date dateOdReservation;
    private int tickets;
    private Projection projection;
    private User user;

    public Reservation() {
    }

    public Reservation(Long id, Date timeOfReservation, Date dateOdReservation, int tickets, Projection projection, User user) {
        this.id = id;
        this.timeOfReservation = timeOfReservation;
        this.dateOdReservation = dateOdReservation;
        this.tickets = tickets;
        this.projection = projection;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeOfReservation() {
        return timeOfReservation;
    }

    public void setTimeOfReservation(Date timeOfReservation) {
        this.timeOfReservation = timeOfReservation;
    }

    public Date getDateOdReservation() {
        return dateOdReservation;
    }

    public void setDateOdReservation(Date dateOdReservation) {
        this.dateOdReservation = dateOdReservation;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Projection getProjection() {
        return projection;
    }

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
