package single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity(name = "st_cat")
@DiscriminatorValue("cat")
public class Cat extends Animal {

    @Column(name = "instagram_link", length = 500)
    private String instagramLink;

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }}
