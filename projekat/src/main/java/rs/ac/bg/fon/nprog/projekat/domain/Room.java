package rs.ac.bg.fon.nprog.projekat.domain;

public class Room {
    private Long id;
    private int capacity;
    private String name;

    public Room() {
    }

    public Room(Long id, int capacity, String name) {
        this.id = id;
        this.capacity = capacity;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
