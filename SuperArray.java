public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
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
    String[] resize = new String[data.length * 2];
    for (int i = 0; i < data.length; i++) {
      resize[i] = data[i];
    }
    data = resize;
  }

  public boolean isEmpty() {
      if (size() != 0) {
        return false;
      }
    return true;
  }

  public void clear() {
    data = new String[10];
  }

  public String toString() {
    String elements = "[";
    int last = 0;
    if (size() == 0) {
      return "[]";
    }
    for (int i = 1; i < size(); i++) {
        elements += data[i-1] + ", ";
        last ++;
    }
    return elements + data[last] + "]";
  }

  public boolean contains(String s) {
    for (int i = 0; i < size(); i ++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    for (int i = size() - 1; i >= index; i--) {
     if (i+1 >= data.length) {
        resize();
      }
      data[i+1] = data[i];
    }
    data[index] = element;
  }

  public String remove(int index) {
    String removed = data[index];
    for (int i = index; i < size() - 1; i ++) {
      data[i] = data [i+1];
    }
    data[size() - 1] = null;
    return removed;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size(); i ++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] array = new String[size()];
    for (int i = 0; i < size(); i++) {
      array[i] = data[i];
    }
    return array;
  }

  public int lastIndexOf(String value) {
    int lastIndex = -1;
    for (int i = 0; i < size(); i++) {
      if ((data[i]).equals(value)) {
        lastIndex = i;
      }
    }
    return lastIndex;
  }

  public boolean equals(SuperArray other) {
    return toString().equals(other.toString());
  }

}
