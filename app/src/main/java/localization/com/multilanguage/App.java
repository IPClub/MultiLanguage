package localization.com.multilanguage;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;


public class App extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
    }

}
