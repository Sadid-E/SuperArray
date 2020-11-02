public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public int size() {
    int size = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        size++;
      }
    }
    return size;
  }

  public boolean add(String element) {
    int i = 0;
    while (data[i] != null) {
      i++;
    }
    data[i] = element;
    return data[i] == element;
  }

}
