package table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity
@Table(name = "table_per_class_cat", schema = "hibernate_lectures")
public class Cat extends Animal {

    @Column(name = "instagram_link", length = 500)
    private String instagramLink;

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }}
