package Model;
import View.ViewClass;

public class Worker {
    public static String name="Alesha";

    public static void setWorkerName(String _name) throws setWorkerNameException{
        if (_name.matches("(?i).*[a-zа-я].*")){
            name = _name;
        }else throw  new setWorkerNameException(null);
    }
    public static   void Work(String method) throws setMethodException {
        if(method !="Стругать" && method !="Пилить" &&  method !="Раскрутить" && method !="Закрутить"){
            throw new setMethodException(null);
        }
        if(method == ViewClass.getChip())
            Plane.Chip(Hervesting.Form);
        if(method == ViewClass.getCut())
            Saw.Cut(Hervesting.Form);
        if(method == ViewClass.getScrewdriver())
            Screwdriv.Unleash();
        else Screwdriv.Twist();
        }
    }
