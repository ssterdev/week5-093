import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
    // write test code here
    Person pekka = new Person("Pekka", 15, 2, 1993);
    pekka.age();
    System.out.println(pekka.age()); 
  	Person sergiu = new Person("SErgiu", 29, 3, 1990);
	System.out.println(sergiu.age());
  MyDate test = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.DATE));
  System.out.println(test);
  }
}
