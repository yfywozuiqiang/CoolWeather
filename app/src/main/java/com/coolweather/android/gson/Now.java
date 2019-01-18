package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yfy on 2019/1/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
