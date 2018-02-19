package com.uscold.ProfileSetup.test.profiles;

import com.uscold.ProfileSetup.test.Abstract;
import com.uscold.ProfileSetup.test.utility.AssistPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * ********************************************
 * * Created by ${"Robert Morales"} on 2/14/2018.
 * ********************************************
 **/
public class ProfileSetupDataUpload extends Abstract{
    final static String WHSE = "160 - MILFORD";


    @DataProvider()
    public Object[][] getLoginData() {
        Object data[][] = AssistPage.getTestData("profilesetup");
        return data;
    }

    //priority = 1, description = "TC: Search drivers at the whse level",
    @Test(priority = 1, dataProvider = "getLoginData")
    public void ProfileSetup(
            String whNum,
            String profile,
            String shortdesc,
            String longdesc,
            String profilestatusdd,
            String processgroup,
            String levels,
            String negatablelevels,
            String valuestatusdd,
            String typeddone,
            String textdescone,
            String mandatoryvalueone,
            String selectparameterone,
            String typeddtwo,
            String textdesctwo,
            String mandatoryvaluetwo,
            String selectparametertwo,
            String typeddthree,
            String textdescthree,
            String mandatoryvaluethree,
            String selectparameterthree
    ) throws InterruptedException {

        extentTest = extent.startTest("TC: Validate driver on the Yard overlook page at warehouse" + whNum + ".");

        AssistPage.chooseMod(driver, "Label Setup");

        AssistPage.sendInput(driver, "id", "gs_lblFormat",
                whNum +
                        profile +
                        shortdesc +
                        longdesc +
                        profilestatusdd +
                        processgroup +
                        levels +
                        negatablelevels +
                        valuestatusdd +
                        typeddone +
                        textdescone +
                        mandatoryvalueone +
                        selectparameterone +
                        typeddtwo +
                        textdesctwo +
                        mandatoryvaluetwo +
                        selectparametertwo +
                        typeddthree +
                        textdescthree +
                        mandatoryvaluethree +
                        selectparameterthree
        );
        ;
//        AssistPage.sendInput(driver, "id", "gs_lblFormat", labelForm+labelType);
        System.out.println(whNum);
        System.out.println(profile);
        System.out.println(shortdesc);
        System.out.println(longdesc);
        System.out.println(profilestatusdd);
        System.out.println(processgroup);
        System.out.println(levels);
        System.out.println(negatablelevels);
        System.out.println(valuestatusdd);
        System.out.println(typeddone);
        System.out.println(textdescone);
        System.out.println(mandatoryvalueone);
        System.out.println(selectparameterone);
        System.out.println(typeddtwo);
        System.out.println(textdesctwo);
        System.out.println(mandatoryvaluetwo);
        System.out.println(selectparametertwo);
        System.out.println(typeddthree);
        System.out.println(textdescthree);
        System.out.println(mandatoryvaluethree);
        System.out.println(selectparameterthree);
    }
}
