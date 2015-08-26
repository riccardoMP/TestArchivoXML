package pe.gob.onpe.testarchivoxml.model.bean;

import android.graphics.Color;

/**
 * Created by rmija on 26/08/2015.
 */
public class Colors {
    public String colorRGB;

    public int getColor(){

        return Color.parseColor(this.colorRGB);
    }


}
