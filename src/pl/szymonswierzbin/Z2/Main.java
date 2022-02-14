package pl.szymonswierzbin.Z2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static <E> void wypiszCoDrugi (Iterable<E> tab){
        int tymczasowy=1;
        boolean pierwsza=true;
        for(E x: tab){
            if(tymczasowy%2==0){
                if(pierwsza){
                    System.out.print(x);
                    pierwsza=false;
                } else System.out.print("," + x);

            }
            tymczasowy+=1;
        }
    }
    public static void main(String [] args){
        ArrayList<Integer> t1=new ArrayList<>();
        t1.add(1);
        t1.add(2);
        t1.add(3);
        t1.add(4);
        t1.add(5);
        t1.add(6);
        t1.add(7);
        t1.add(8);
        LinkedList<String> t2=new LinkedList<>();
        t2.add("jeden");
        t2.add("dwa");
        t2.add("trzy");
        t2.add("cztery");
        Stack<Integer> t3=new Stack<>();
        t3.add(1);
        t3.add(2);
        t3.add(1);
        t3.add(2);
        t3.add(1);
        t3.add(2);
        System.out.println("Dla tablicy t1:"+t1);
        wypiszCoDrugi(t1);
        System.out.println("");
        System.out.println("Dla LinkedList t2:"+t2);
        wypiszCoDrugi(t2);
        System.out.println("");
        System.out.println("Dla Stack t3:"+t3);
        wypiszCoDrugi(t3);




    }


}
