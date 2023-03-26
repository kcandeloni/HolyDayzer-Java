public class Date {
  private String date;
  private String description;

  Date(String date, String description){
    this.date = date;
    this.description = description;
  }

  String gatDate(){
    return date;
  }

  String gatDescription(){
    return description;
  }

}
