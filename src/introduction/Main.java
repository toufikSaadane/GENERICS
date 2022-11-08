package introduction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        printDouble(arrayList);
    }

    private static void printDouble(ArrayList<Integer> arrayList) {
        for (Object o : arrayList){
            System.out.println((Integer) o * 2);
        }
    }
}
