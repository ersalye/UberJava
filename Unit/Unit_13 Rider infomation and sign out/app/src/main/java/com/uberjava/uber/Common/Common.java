package com.uberjava.uber.Common;

import com.uberjava.uber.Model.RiderModel;

public class Common {

    public static final String DRIVER_INFO_REFERENCE = "Riders";
    public static RiderModel currentRider;

    public static String buildWelcomeMessage() {
        if (Common.currentRider != null)
        {
            return new StringBuilder("Welcome ")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName()).toString();
        }
        else
            return "";
    }
}
