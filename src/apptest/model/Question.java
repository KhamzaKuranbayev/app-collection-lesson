package apptest.model;

import java.util.Random;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:58 PM
 */
public class Question {
    private final Long ID = new Random(999999).nextLong();
    private String text;
    private Subject subject;

    public Question(String text, Subject subject) {
        this.text = text;
        this.subject = subject;
    }
}
