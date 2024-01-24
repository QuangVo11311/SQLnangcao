package CSDL_BT4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        AttributeClosure a = new AttributeClosure("Dependency_file.txt");
        HashSet<Character> X = a.string2set("CGH");
        a.printSet(a.closure(X)); // in bao đóng ra
    }
}