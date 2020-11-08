public class Demo {

  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i > 0; i--) {
      if (i > s.indexOf(s.get(i))) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    removeDuplicates(a);
    removeDuplicates(b);
    for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < a.size(); j++) {
        if (a.get(i).equals(b.get(j))) {
          overlap.add(a.get(i));
        }
      }
    }
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray zip = new SuperArray();
      int size = 0;
      if (a.size() > b.size()) {
        size = a.size();
      } else {
        size = b.size();
      }
      for (int i = 0; i < size; i++) {
        zip.add(a.get(i));
        zip.add(b.get(i));
      }
    return zip;
  }

  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9"); a.add("1"); a.add("2"); a.add("2"); a.add("3"); a.add("4");
    b.add("0"); b.add("4"); b.add("2"); b.add("2"); b.add("9");
    System.out.println(findOverlap(a,b));

    System.out.println(a);
    System.out.println(b);
    System.out.println(zip(a,b));
    System.out.println(zip(b,words));
    System.out.println(zip(a,words));
  }

}
