package com.jsstech.newsappdemo.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.jsstech.newsappdemo.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery,container,false);

        // create a webView
        WebView webView=root.findViewById(R.id.webviewalg);
        //comments
        //offline path of  htmle file which store in asset folder.
        //for creating asset folder1)In project explorer select Android.then right click on
        // app folder select new select create folder,then select asset folder.
        //if you want to create directory right clickon asset folder,then select asset directory then enter.

        webView.loadUrl("file:///android_asset/htmlfile/myfile.html");

        //webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new WebViewClient());

        return root;
    }
}