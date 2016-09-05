package table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity
@Table(name = "table_per_class_fox", schema = "hibernate_lectures")
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
