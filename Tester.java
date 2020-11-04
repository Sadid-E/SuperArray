import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray(2);
    System.out.println(a.size());
    System.out.println(a.add("1"));
    System.out.println(a.get(0));
    System.out.println(a.set(0,"0"));
    System.out.println(a.add("1"));
    System.out.println(a.add("2"));
    System.out.println(a.add("3"));
    System.out.println(a.add("4"));
    System.out.println(a.add("5"));
    System.out.println(a.add("6"));
    System.out.println(a.add("7"));
    System.out.println(a.add("8"));
    System.out.println(a.add("9"));
    System.out.println(a.add("10"));
    System.out.println(a.isEmpty());
    System.out.println(a.get(0));
    a.clear();
    System.out.println(a.get(0));
    System.out.println(a.add("1"));
    System.out.println(a.get(0));
    System.out.println(a.set(0,"0"));
    System.out.println(a.add("1"));
    System.out.println(a.add("2"));
    System.out.println(a);
    System.out.println(a.contains("10"));
    System.out.println(b.add("hello"));
    System.out.println(b.add("are"));
    System.out.println(b.add("you"));
    System.out.println(b);
    b.add(1,"how");
    System.out.println(b);
    System.out.println(a);
    System.out.println(a.remove(1));
    System.out.println(a);
    System.out.println(a.add("2"));
    System.out.println(a.add("1"));
    System.out.println(a.add("0"));
    System.out.println(a);
    System.out.println(a.indexOf("2"));
    System.out.println(a.indexOf("3"));
    System.out.println(Arrays.toString(a.toArray()));
    System.out.println(Arrays.toString(b.toArray()));
  }

}
