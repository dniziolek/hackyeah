package kebaza.com.kebaza;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by aemulor on 10/28/17.
 */

public class BestKebebFinder {

    KebabPlace tanti = new KebabPlace("Tanti", 50.0756986f, 19.907227f, Size.medium);
    KebabPlace szwagier = new KebabPlace("Szwgier", 50.0658696f,19.9307775f, Size.big);

    public KebabPlace findBestKebab(Size size)
    {
        KebabPlace place;
        if (size == Size.big)
        {
            place = szwagier;
        }
        else
        {
            place = tanti;
        }
        return place;
    }
}
