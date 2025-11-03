package group.project.imdbClone;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    @Id
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    // No-args constructor
    public Review() {
    }

    // All-args constructor
    public Review(ObjectId id, String body, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    // Partial constructor (matching your existing one)
    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    // Getters and setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    // Optional: toString() for debugging/logging
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
