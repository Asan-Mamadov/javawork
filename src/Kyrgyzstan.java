public class Kyrgyzstan extends Germany {
    String location;
    boolean asia;

    public Kyrgyzstan(String name,int numbers,String location,boolean asia){
        super(name,numbers);
        this.location=location;
        this.asia=asia;
    }

    public void country1Kyrgyzstan(){
        super.countryGermany();
        System.out.println(" Жайгашкан жери " + location +  " германия олкосунон кичинеби " + (asia ? "ооба":"жок"));
    }
}
