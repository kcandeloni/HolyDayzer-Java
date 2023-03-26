import java.util.ArrayList;
import java.util.Scanner;

public class Holiday implements IHoliday{
  private ArrayList<Date> holidays = new ArrayList<>();

  public void setDate(Date date){
    boolean isHoliday = true;
    for(Date holiday : this.holidays){
      if(holiday.gatDate().equals(date.gatDate())){
        isHoliday = false;
      }
    }
    if(isHoliday){
      holidays.add(date);
    }else{
      System.out.println(date.gatDate() + " Já existe na lista de feriados!");
    }
  }

  public void getDate(String date){
    String description = "A data " + date + " não é um feriado! Remarque a noite de RPG de mesa...";
    for(Date holiday : this.holidays){
      if(holiday.gatDate().equals(date)){
        description = holiday.gatDescription();
      }
    }
    System.out.println(date + " => " + description);
  }

  public void gatAllHoliday(){
    for(Date holiday : this.holidays){
      System.out.println(holiday.gatDate() + " : " + holiday.gatDescription());
    }
  }

  public void addInputUserHoliday(){

    System.out.println("\nInserir um novo feriado:\n");

        Scanner inputDate = new Scanner(System.in);
        Scanner inputDescription = new Scanner(System.in);
        
        System.out.println("Informe a data no formato dd/mm/aaaa: ");
        String date = inputDate.next();
        System.out.println("Informe uma descrição: ");
        String description = inputDescription.nextLine();

        Date newDate = new Date(date, description);
        setDate(newDate);
  }
}
