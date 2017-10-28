package kebaza.com.kebaza;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by aemulor on 10/28/17.
 */

public class BestKebebFinder {

    KebabPlace tanti = new KebabPlace("Tanti", 50.0756986f, 19.907227f, Size.medium);
    KebabPlace szwagier = new KebabPlace("Szwgier", 50.0658696f,19.9307775f, Size.big);
    KebabPlace habibi = new KebabPlace("Habibi",  50.026696f , 19.7902979f, Size.medium);
    KebabPlace laMarsa = new KebabPlace("La Marsa", 50.038007f, 19.9391413f, Size.small);
    KebabPlace pod13 = new KebabPlace( "Kebab pod 13", 50.0482559f, 19.9418603f, Size.big);
    KebabPlace misterKebab = new KebabPlace( "MisterKebab", 50.0627687f,19.9324045f, Size.small);

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
