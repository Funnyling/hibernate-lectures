package single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity(name = "st_fox")
@DiscriminatorValue("fox")
public class Fox extends Animal {

    @Column(name = "zoo_name")
    private String zooName;

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }
}
