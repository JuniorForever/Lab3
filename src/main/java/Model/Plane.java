package Model;

public class Plane extends  Tool {
    public Plane(int _weight){
        weight = _weight;
    }
    public static void Chip(String _Form){
        _Form = "Форма изменена рубанком";
        Hervesting.Form = _Form;
    }
}
