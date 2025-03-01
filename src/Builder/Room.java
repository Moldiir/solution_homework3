package src.Builder;
public class Room {
    private String description;

    public Room(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
