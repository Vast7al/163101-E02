package pl.szymonswierzbin.Z1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static <T extends Comparable<? super T>> boolean czyJestPalindronem(T[] tab){
        ArrayList<T> tab1 = new ArrayList<>();
        ArrayList<T> tab2= new ArrayList<>();
        for(T x: tab){
            tab1.add(x);
        }
        for(int i=tab1.size()-1;i>=0;i--){
            tab2.add(tab1.get(i));
        }
        String t1s=tab1.toString();
        String t2s=tab2.toString();
        return t1s.compareTo(t2s)==0;
    }
    public static void main(String[] args){
        Integer[] t1={1,2,3,2,1};
        System.out.println(czyJestPalindronem(t1));
        LocalTime[] t2={LocalTime.parse("10:20"),LocalTime.parse("12:40"),LocalTime.parse("13:00"),LocalTime.parse("12:40"),LocalTime.parse("10:20")};
        System.out.println(czyJestPalindronem(t2));
        Integer[] t1f={1,2,3,2,2};
        System.out.println(czyJestPalindronem(t1f));
        LocalTime[] t2f={LocalTime.parse("10:20"),LocalTime.parse("12:40"),LocalTime.parse("13:00"),LocalTime.parse("11:22"),LocalTime.parse("16:44")};
        System.out.println(czyJestPalindronem(t2f));


    }
}
