package apptest.model;

import java.util.Random;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:59 PM
 */
public class Answer {
    private final Long ID = new Random(999999).nextLong();
    private String text;
    private boolean status;
    private Question question;

    public Answer(String text, boolean status, Question question) {
        this.text = text;
        this.status = status;
        this.question = question;
    }
}
