package apptest.model;

import java.util.Random;
import java.util.UUID;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:58 PM
 */
public class Role {
    private final UUID ID = UUID.randomUUID();
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
