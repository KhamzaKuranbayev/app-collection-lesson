package listexam;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 5/14/2022
 * Time: 3:10 PM
 */
public class ListDemo {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add(1);
        collection.add("bir");
        collection.add("one");
        collection.add('1');
        collection.add(true);
        collection.add(1.0);

        System.out.println(collection);*/

//        List
//        Set
//        Queue
//        SortedMap
//
//        List<String> list = new ArrayList<>();
//        list.add("Alisher");
//        list.add("Tohir");
//        list.add("Karim");
//        list.add("Temur");
//
//        list.add(1, "Salim");

        /*List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        System.out.println("FIRST FIVE PRIME NUMBERS: " + firstFivePrimeNumbers);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        firstTenPrimeNumbers.add(13);
        firstTenPrimeNumbers.add(17);
        firstTenPrimeNumbers.add(19);
        firstTenPrimeNumbers.add(23);
        firstTenPrimeNumbers.add(29);
        System.out.println("TEN TEN PRIME NUMBERS: " + firstTenPrimeNumbers);*/
//
//        List<String> topCompanyNames = new ArrayList<>();
//        System.out.println("List isEmpty? " + topCompanyNames.isEmpty());
//
//        topCompanyNames.add("GOOGLE");
//        topCompanyNames.add("FACEBOOK");
//        topCompanyNames.add("TWITTER");
//        topCompanyNames.add("AMAZON");
//        topCompanyNames.add("APPLE");
//
//        System.out.println("Top " + topCompanyNames.size() + " Companies in the world");
//
//        String bestCompany = topCompanyNames.get(0);
//        String secondBestCompany = topCompanyNames.get(1);
//        String lastCompany = topCompanyNames.get(topCompanyNames.size() - 1);
//
//        System.out.println("Best: " + bestCompany);
//        System.out.println("Second Best: " + secondBestCompany);
//        System.out.println("Last: " + lastCompany);
//
//        topCompanyNames.set(1, "BLOOMBERG");
//        System.out.println(topCompanyNames);


        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C");
        programmingLanguages.add("C#");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Ruby");

        System.out.println(programmingLanguages);

//        String removedElement = programmingLanguages.remove(6);
//        System.out.println("Removed: " + removedElement);
//        System.out.println(programmingLanguages);
//
//        boolean isRemovedKotlin = programmingLanguages.remove("Dart");
//        System.out.println(isRemovedKotlin);
//
        /*List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("PHP");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Python");*/

//        boolean isRemoved = programmingLanguages.removeAll(scriptingLanguages);
//        System.out.println(isRemoved);
//        System.out.println(programmingLanguages);

        /*boolean isRemoved = programmingLanguages.removeIf(s -> s.startsWith("C"));
        System.out.println(isRemoved);
        System.out.println(programmingLanguages);

        programmingLanguages.clear();
        System.out.println(programmingLanguages.isEmpty());
        */


        // ITERATING LIST
        /*
          1. Java 8 forEach()
          2. iterator()
          3. Java 8 forEachRemaining()
          4. listIterator()
          5. for each loop
          6. for with index
         */

        List<String> books = new ArrayList<>();
        books.add("Hadis va Hayot");
        books.add("O'tgan kunlar");
        books.add("Vaqt qandri");
        books.add("Brilliant odatlar");
        books.add("Baxtiyor oila");

        // Java 8 forEach()
        //books.forEach(System.out::println);


        // iterator()
        /*Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            // logic
            System.out.println(book);
        }*/

        // forEachRemaining()
        //iterator.forEachRemaining(System.out::println);

        // listIterator
//        ListIterator<String> listIterator = books.listIterator(books.size());
//        while (listIterator.hasPrevious()) {
//            String book = listIterator.previous();
//            System.out.println(book);
//        }

        /*for (String book : books) {
            System.out.println(book);
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }*/

        // Example remove with iterator
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(13);
        numbers.add(18);
        numbers.add(90);
        numbers.add(143);
        numbers.add(187);
        numbers.add(24);
        numbers.add(67);
        numbers.add(90);

        /*System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if(number % 2 == 1) {
                iterator.remove();
            }
        }

        System.out.println(numbers);*/

        // Searching element from ArrayList
        if(numbers.contains(144))
            System.out.println("Found element!");
        else
            System.out.println("Not Found!");

        int index = -1;
        index = numbers.indexOf(145);
        index = numbers.lastIndexOf(90);
        System.out.println(index);

        if(index != -1) {
            // logix
        }
    }
}
