package letterInventory;

public class LetterInventory {
  private int[] data; //一个由int组成的叫data的array;
  private int size; //最开始没写，看到boolean isEmpty()描述后加的


  /**
   * constructor的过程是新建object;
   * data is a string, this.data is an array made of integers;
   */
  public LetterInventory(String data) {
    data = data.toLowerCase();
    for (int i = 0; i < data.length(); i++) {
      if (Character.isLetter(data.charAt(i))) {
        this.data[data.charAt(i)-'a'] ++; //this.data is an array;
        this.size++; //??
      }
    }
  }

  public int get(char letter) {
    letter = Character.toLowerCase(letter);
    if (Character.isLetter(letter)) {
      return this.data[letter - 'a'];
    } else {
      throw new IllegalArgumentException();
    }
  }

// set 改field的值
  public void set(char letter, int value) {
     letter = Character.toLowerCase(letter);
     if (value < 0 || !Character.isLetter(letter) ) {
       throw new IllegalArgumentException();
     } else {
       size -= this.data[letter - 'a'];
       this.data[letter - 'a'] = value;
       size += value;
     }
  }

  public int size() {
    return size;
  }

  public boolean isEmpty(){
    return size() == 0;
  }

  public String toString() {
    String res =  "[";
    for (int i = 0; i < this.data.length;i++) {
      for (int j = 0; j < this.data[i]; j++) {
        res += (char) (i+ 'a');
      }
    }
    return res + "]";
  }

  public LetterInventory add(LetterInventory other) {
    LetterInventory sum = new LetterInventory("");
    for (int i = 0; i < this.data.length; i++) {
      char ch = (char) ('a' + i);
      int value = this.data[i] - other.get(ch);
      sum.set(ch, value);
    }
    return sum;
  }

  public LetterInventory substract(LetterInventory other) {
    LetterInventory diff = new LetterInventory("");
    for (int i = 0; i < this.data.length; i++) {
      char ch = (char) ('a' + i);
      int value = this.data[i] - other.get(ch);
      if (value < 0) {
        return null;
      }
      diff.set(ch, value);
    }
    return diff;
  }
}


