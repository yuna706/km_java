package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSt {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("136");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "93");
        pitches.add(5);

        System.out.println(pitches);
        System.out.println(pitches.get(0));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(3));
        System.out.println(pitches.remove("93"));
        System.out.println(pitches);

        ArrayList<String> pitches2 = new ArrayList();
        pitches2.add("136");
        pitches2.add("129");
        pitches2.add("142");
        pitches2.add(0, "93");
        System.out.println(pitches2);
        String a = (String) pitches2.get(0);
        System.out.println(a);

        ArrayList<String> pitches3 = new ArrayList(Arrays.asList("123", "456", "678"));
        System.out.println(pitches3);
        String[] weeks = new String[]{"월", "화", "수", "목", "금", "토", "일"};
        new ArrayList(Arrays.asList(weeks));
        System.out.println(weeks);
        System.out.println(String.join(", ", weeks));
        pitches2.sort(Comparator.naturalOrder());
        System.out.println(pitches2);
        pitches2.sort(Comparator.reverseOrder());
        System.out.println(pitches2);
    }
}
