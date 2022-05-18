package listexam;

import java.util.UUID;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:04 PM
 */
public class User implements Comparable<User>{
    private final UUID ID = UUID.randomUUID();
    private String fullName;
    private Integer age;

    public User(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public UUID getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int compareTo(User o) {
        return this.getAge().compareTo(o.getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
