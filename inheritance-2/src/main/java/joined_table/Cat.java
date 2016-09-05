package joined_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity(name = "jt_cat")
@Table(name = "jt_cat", schema = "hibernate_lectures")
@PrimaryKeyJoinColumn(name = "id")
public class Cat extends Animal {

    @Column(name = "instagram_link", length = 500)
    private String instagramLink;

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }}
