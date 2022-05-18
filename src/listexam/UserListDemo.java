package listexam;

import java.util.*;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/15/2022
 * Time: 3:06 PM
 */
public class UserListDemo {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Tohirjon Salimov", 25));
        userList.add(new User("Sobijon Tohirov", 60));
        userList.add(new User("Abdulloh Karimov", 35));

        System.out.println("======= Before sorting =======");
        userList.forEach(System.out::println);

//        userList.sort((o1, o2) -> o2.getAge().compareTo(o1.getAge()));
//        userList.sort(Comparator.naturalOrder());
        userList.sort(Comparator.comparingInt(User::getAge));
        userList.sort((o1, o2) -> o2.getAge() - o1.getAge());

        userList.sort(Comparator.comparing(User::getFullName));
        System.out.println("======= After sorting =======");
        userList.forEach(System.out::println);











        /*Collections.shuffle(userList, new Random());
        System.out.println("======= After shuffle =======");
        userList.forEach(System.out::println);
*/

/*        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(13);
        numbers.add(18);
        numbers.add(90);
        numbers.add(143);
        numbers.add(187);
        numbers.add(24);
        numbers.add(67);
        numbers.add(90);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);*/


    }
}
