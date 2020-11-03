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
    if (i >= data.length) {
      resize();
    }
  }
    data[i] = element;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String value = data[index];
    data[index] = element;
    return value;
  }

  private void resize() {
    String[] resize = new String[data.length + 10];
    for (int i = 0; i < data.length; i++) {
      resize[i] = data[i];
    }
    data = resize;
  }

  public boolean isEmpty() {
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null) {
        return false;
      }
    }
    return true;
  }

  public void clear() {
    data = new String[10];
  }

}
