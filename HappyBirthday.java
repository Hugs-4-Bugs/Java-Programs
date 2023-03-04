import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
public class HappyBirthday {
   public static void main(String args[]) {
      int date_of_birth = 3;
      Month month_of_birth = Month.JANUARY;
      LocalDate current_date = LocalDate.now();
      System.out.println("Today's Date is " + current_date);
      int date = current_date.getDayOfMonth();
      Month month = current_date.getMonth();
      if(date == date_of_birth && month == month_of_birth) {
         System.out.println("🎉🎁🥳🎊🎂 ⎼ HAPPY BIRTHDAY TO YOU ABHIMANYU ⎼ 🎉🎁🥳🎊🎂");
      } else {
     System.out.println("❌❌❌ Today is not your Birthday ❌❌❌");
      }
   }
}
   