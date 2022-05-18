package apptest.model;

import java.util.Random;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:58 PM
 */
public class Subject {
    private final Long ID = new Random(999999).nextLong();
    private String name;

    public Subject(String name) {
        this.name = name;
    }
}
