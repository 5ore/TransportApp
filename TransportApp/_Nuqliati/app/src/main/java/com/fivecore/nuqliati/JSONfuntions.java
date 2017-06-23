package com.fivecore.nuqliati;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lukaz on 18.6.2017..
 */

public class JSONfuntions extends AsyncTask<String, String, String> {


    @Override
    protected String doInBackground(String... strings) {

        BufferedReader reader = null;
        HttpURLConnection httpclient = null;

        // Download JSON data from URL
        try {
            URL _url = new URL(strings[0]);
            httpclient = (HttpURLConnection) _url.openConnection();
            httpclient.connect();

            InputStream stream = httpclient.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();

            String line = "";
            while((line = reader.readLine()) != null)
                buffer.append(line);

            return buffer.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            httpclient.disconnect();
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
