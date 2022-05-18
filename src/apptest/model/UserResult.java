package apptest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 4:00 PM
 */
public class UserResult {
    private final Long ID = new Random(999999).nextLong();
    private User user;
    private List<Answer> answerList = new ArrayList<>();
}
