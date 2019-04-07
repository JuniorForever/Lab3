package Model;

import sun.security.util.Length;

public class Saw extends Tool {
    private static int length;
    public Saw(int _weight,int _length){
        length = _length;
        weight = _weight;
    }
    public static void setLength(int _length) throws setLengthExeption{
        if(_length> 0) {
            length=_length;
        }else throw new setLengthExeption(null);
    }
    public static void Cut(String _Form){
        _Form = "Форма изменена пилой";
        Hervesting.Form = _Form;
    }
}