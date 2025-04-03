public class Country {
   private String [][] country = {
           {"Кыргызстан", "кыргыз", "8", "Централная Азия"},
           {"Deutschland", "deutsch", "23", "Europa"}
   };
    public void printCountry(){
       for (int i = 0;i < country.length;i++){
           System.out.println("Мамлекет " + country[i][0]);
           System.out.println("Улуту " + country[i][1]);
           System.out.println("Мамлекеттин саны " + country[i][2]);
           System.out.println("Жайгашкан жери " + country[i][3]);
       }
    }

}
