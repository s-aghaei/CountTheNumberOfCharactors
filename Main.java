package countTheNumberOfCharactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>
                (Arrays.asList("Amir", "Hatef","Mehran", "Mojtaba",
                        "Mohammad", "Ali", "Davood", "Reza", "Mohsen"));


        Map<Integer, List<String>> groupByLengthMap = names.
                stream().
                collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(groupByLengthMap);


        Map<Integer, Long> groupByLengthNumberMap = names.
                stream().
                collect(Collectors.groupingBy(name -> name.length(),
                        Collectors.counting()));
        System.out.println(groupByLengthNumberMap);
    }
}
