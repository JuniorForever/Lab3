package Model;
import View.ViewClass;

public class Product {
    public static String readyStatus;
    public static String checkReady(){
       if(ViewClass.getScrewdriver()=="Раскрутить"){
           readyStatus = "Готово";
       }else {
           readyStatus = "Не готово";
       }
       return  readyStatus;
       }
    }
