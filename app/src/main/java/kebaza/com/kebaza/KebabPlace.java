package kebaza.com.kebaza;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by aemulor on 10/28/17.
 */
enum Size {small, medium, big};

public class KebabPlace implements Serializable {

    public static final String alias = "KebabPlace";

    public String name;
    public float latitude;
    public float longitude;
    public Float price;
    public Size size;


    public KebabPlace(String name, float latitude, float longitude, Size size)
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.size = size;
    }

}
