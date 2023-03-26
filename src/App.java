public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calendário de Feriados:\n");

        Holiday holiday = new Holiday();
        Date date1 = new Date("01/01/2023", "Confraternização mundial");
        holiday.setDate(date1);
        Date date2 = new Date("21/02/2023", "Carnaval");
        holiday.setDate(date2);
        Date date3 = new Date("17/04/2023", "Páscoa");
        holiday.setDate(date3);
        Date date4 = new Date("21/04/2023", "Tiradentes");
        holiday.setDate(date4);
        Date date5 = new Date("01/05/2023", "Dia do trabalho");
        holiday.setDate(date5);
        Date date6 = new Date("08/06/2023", "Corpus Christi");
        holiday.setDate(date6);
        Date date7 = new Date("07/09/2023", "Independência do Brasil");
        holiday.setDate(date7);
        Date date8 = new Date("12/10/2023", "Nossa Senhora Aparecida");
        holiday.setDate(date8);
        Date date9 = new Date("02/11/2023", "Finados");
        holiday.setDate(date9);
        Date date10 = new Date("15/11/2023", "Proclamação da Republica");
        holiday.setDate(date10);
        Date date11 = new Date("25/12/2023", "Natal");
        holiday.setDate(date11);
        Date date12 = new Date("01/01/2023", "Primeiro dia do Ano");
        holiday.setDate(date12);

        holiday.getDate("17/04/2023");
        holiday.getDate("25/05/2023");

        System.out.println("\nLista de Feriados:\n");
        holiday.gatAllHoliday();

        holiday.addInputUserHoliday();
        holiday.gatAllHoliday();
    }
}