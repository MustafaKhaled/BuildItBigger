package com.example.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.udacity.gradle.builditbigger.EndPointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import timber.log.Timber;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsynctaskTest {


    private Context context;

    @Test
    public void testResult() {
        String joke = null;
        EndPointsAsyncTask asyncTask = new EndPointsAsyncTask(context);
        try {

            joke = asyncTask.get(30, TimeUnit.SECONDS);
            Timber.d("NonEmpty Joke" + joke);
        } catch (Exception e) {
            joke = " ";
            Timber.e("error" + e.getStackTrace());
        }
        assertFalse(TextUtils.isEmpty(joke));
        assertNotNull("Joke is not found",joke);

    }
}
