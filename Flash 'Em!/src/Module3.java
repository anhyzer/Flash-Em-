import java.util.ArrayList;
import java.util.Random;

/**
 * This class includes generic object methods in order to shuffle and sort and arraylist.
 * @author Michael Soskin
 * @version 1.7
 * @date 4/18/21
 */

public class Module3 {

    /**
     * shuffle Arraylist object
     *
     * @param list
     * @param <E>
     */
    public static <E> void shuffle(ArrayList<E> list) {
        Random ran = new Random();
        int index1, index2;
        for (int i = 0; i < list.size() / 2; i++) {

            index1 = ran.nextInt(list.size());

            index2 = ran.nextInt(list.size());

            if (index1 > index2) {
                E num = list.remove(index1);
                list.add(index2, num);
                num = list.remove(index2 + 1);
                list.add(index1, num);

            } else if (index2 > index1) {
                E num = list.remove(index2);
                list.add(index1, num);
                num = list.remove(index1 + 1);
                list.add(index2, num);
            }
        }
    }

    /**
     * method to sort a generic list
     *
     * @param <E>
     * @param list
     */
    public static <E extends Comparable> void sort(ArrayList<E> list) {

        int min;

        for (int i = 0; i < list.size() - 1; i++) {
            min = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(min)) < 0)
                    min = j;
            }

            if (i != min) {
                E temp1 = list.remove(min);
                E temp2 = list.remove(i);
                list.add(i, temp1);
                list.add(min, temp2);
            }
        }
    }
}
