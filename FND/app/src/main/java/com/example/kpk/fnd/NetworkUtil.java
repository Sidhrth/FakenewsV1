package com.example.kpk.fnd;

import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


class NetworkUtil {

    //URL builder ARGUMENT IS JSONOBJECT
    public static URL urlbuilding (JSONObject inputdata)
    {
        //insert URL and argument (inputdata)

        String url1 = "";
        URL url = null;
        // add URL/IP Address

        try {
            url = new URL(url1);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }


    //////NOT FUNCTIONAL
    public static URL buildUrl(String CustomSearchQuery) {
        // looking for
        String strNoSpaces = CustomSearchQuery.replace(" ", "+");

        // Your API key
//        String key = "AIzaSyCAajBXGsQKg4FDMBF2Lc1ffl1UtYP5Fzg";
        String key = "AIzaSyDRWRoMz4Jw6Iqqj0cSt9dXBFmd3q_23hE";

        // Your Search Engine ID
        String cx = "013670998315178887075:tstnn39qzcq";

        String url2 = "https://www.googleapis.com/customsearch/v1?q=" + strNoSpaces + "&key=" + key + "&cx=" + cx + "&alt=json";

        URL url = null;

        try {
            url = new URL(url2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

    //////NOT FUNCTIONAL
    public static URL buildUrlopensearch(String CustomSearchQuery) {
        // looking for
        String strNoSpaces = CustomSearchQuery.replace(" ", "+");

        // Your API key
        String key = "AIzaSyCAajBXGsQKg4FDMBF2Lc1ffl1UtYP5Fzg";

        // Your Search Engine ID
        String cx = "013670998315178887075:ef9hqcm8--q";

        String url2 = "https://www.googleapis.com/customsearch/v1?q=" + strNoSpaces + "&key=" + key + "&cx=" + cx + "&alt=json";

        URL url = null;

        try {
            url = new URL(url2);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }


}
