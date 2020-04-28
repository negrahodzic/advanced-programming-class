package rs.ac.bg.fon.nprog.projekat.domain;

public class Review {
    private Long id;
    private Movie movie;
    private double grade;
    private String comment;

    public Review() {
    }

    public Review(Long id, Movie movie, double grade, String comment) {
        this.id = id;
        this.movie = movie;
        this.grade = grade;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
