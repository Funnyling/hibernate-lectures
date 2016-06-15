package table_per_class;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ntishkevich
 */
@MappedSuperclass
public abstract class Animal implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "color", length = 60)
    private String color;

    @Column(name = "is_wild", nullable = false)
    private Boolean wild;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWild() {
        return wild;
    }

    public void setWild(Boolean wild) {
        this.wild = wild;
    }
}

