package joined_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author ntishkevich
 */
@Entity(name = "j_fox")
@Table(name = "j_fox", schema = "hibernate_lectures")
@PrimaryKeyJoinColumn(name = "id")
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
