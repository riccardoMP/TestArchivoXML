package pe.gob.onpe.testarchivoxml.model.bean;

import android.graphics.Color;


public class Colors {
    public String colorRGB;
    //sdsdsd
    public int getColor(){

        return Color.parseColor(this.colorRGB);
    }


}
