
package logic;

public class Cadena {
    public String cadena;
    public String getcadena(int seg, int min, int hr){
        cadena= hr + " : " + min+ " : " + seg;
        if(hr<10){
            cadena= "0"+hr + " : " + min+ " : " + seg;
            if(min<10){
                cadena= "0"+hr + " : 0" + min+ " : " + seg;
                if(seg<10){
                    cadena= "0"+hr + " : 0" + min+ " : 0" + seg;
                }
            } 
        }  
        return cadena;
    }
}
