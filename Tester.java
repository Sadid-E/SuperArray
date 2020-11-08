import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray(2);
    System.out.println(a.size());
    a.add("1");
    System.out.println(a.get(0));
    System.out.println(a.set(0,"0"));
    a.add("1");  a.add("2");  a.add("3");  a.add("4");  a.add("5");
    a.add("6");  a.add("7");  a.add("8");  a.add("9");  a.add("10");
    System.out.println(a.isEmpty());
    System.out.println(a.get(0));
    a.clear();
    System.out.println(a.get(0));
    a.add("1");
    System.out.println(a.get(0));
    System.out.println(a.set(0,"0"));
    a.add("1");  a.add("2");
    System.out.println(a);
    System.out.println(a.contains("10"));
    b.add("hello"); b.add("hello");  b.add("are");  b.add("you");
    System.out.println(b);
    b.add(2,"how");
    System.out.println(b);
    System.out.println(a);
    System.out.println(a.remove(1));
    System.out.println(a);
    a.add("2");  a.add("1");  a.add("0"); a.add("1");  a.add("2");
    System.out.println(a);
    System.out.println(a.indexOf("2"));
    System.out.println(a.indexOf("3"));
    System.out.println(Arrays.toString(a.toArray()));
    System.out.println(Arrays.toString(b.toArray()));
    System.out.println(a.lastIndexOf("2"));
    System.out.println(b.lastIndexOf("hello"));
    System.out.println(a.equals(b));
    SuperArray c = new SuperArray();
    c = a;
    System.out.println(a.equals(c));
  }

}
