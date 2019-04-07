package Model;

public class Screwdriv extends Tool{
    public Screwdriv(int _weight){
        weight = _weight;
    }
    public static String Unleash(){ return "Раскрутить";
    }
    public static String Twist(){
        return "Закрутить";
    }
}
