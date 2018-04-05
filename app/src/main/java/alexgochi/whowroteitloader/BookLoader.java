package alexgochi.whowroteitloader;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by Alex Gochi on 05/04/2018.
 */

public class BookLoader extends AsyncTaskLoader<String> {
    String mQueryString;

    public BookLoader(Context context, String mQueryString) {
        super(context);
        this.mQueryString = mQueryString;
    }

    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();

        forceLoad();
    }
}
