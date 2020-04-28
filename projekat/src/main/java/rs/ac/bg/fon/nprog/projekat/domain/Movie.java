package rs.ac.bg.fon.nprog.projekat.domain;

public class Movie {
    private Long id;
    private String title;
    private String description;
    private int length;
    private Genre genre; // mozda lista zanrova

    public Movie() {
    }

    
    public Movie(Long id, String title, String description, int length, Genre genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.length = length;
        this.genre = genre;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
